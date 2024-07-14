package MetodosDePago;

import Structure.Cliente;
import javax.swing.JOptionPane;

public class NewClass {

    /*
    public void pedirInfoDelMetodoDePago(Cliente c) {
        if (meto.equalsIgnoreCase("Tarjeta")) {
            metodoDePago = new Tarjeta();
        } else if (metodoPago.equalsIgnoreCase("Efectivo")) {
            metodoDePago = new Efectivo();
        } else if (metodoPago.equalsIgnoreCase("TransferenciaBancaria")) {
            metodoDePago = new TransferenciaBancaria();
        }

    }*/
    public void actualizarMetodoDePago(Cliente c) {
        if (c.getMetodoDePagos().equals("Tarjeta")) {
            Tarjeta newTarjeta = new Tarjeta();
            newTarjeta.setNumeroTarjeta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la tajeta")));
            newTarjeta.setFechaExpiracion(Integer.parseInt(JOptionPane.showInputDialog("ingrese la fecha de expiracion de la manera mm/aa")));
            newTarjeta.setCvv(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numero de la parte trasera de la tarjeta")));
        } else if (c.getMetodoDePagos().equals("Efectivo")) {
        } else if (c.getMetodoDePagos().equals("TransferenciaBancaria")) {
            TransferenciaBancaria newTranferrencia = new TransferenciaBancaria();
            newTranferrencia.setBanco(JOptionPane.showInputDialog("Ingrese le nombre del banco"));
            newTranferrencia.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta")));
        }

        /*if (c.getMetodoDePagos() != null) {
            this.setMetodoDePago(metodoDePago);
            System.out.println("El método de pago ha sido actualizado a " + metodoPago + ".");
        } else {
            System.out.println("Método de pago no válido. Intente nuevamente.");
        }*/
    }
}
