/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosDePago;

/**
 *
 * @author Brandon VM
 */
public class Tarjeta implements
        MetodoDePago {

    private String numeroTarjeta;
    private String fechaExpiracion;
    private String cvv;

    public Tarjeta(String numeroTarjeta, String fechaExpiracion, String cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    @Override
    public void procesarPago(double monto) {
        // Lógica para procesar el pago con tarjeta de crédito
        System.out.println("Procesando pago con tarjeta de crédito de: " + monto + " usando la tarjeta: " + numeroTarjeta);
    }
}
