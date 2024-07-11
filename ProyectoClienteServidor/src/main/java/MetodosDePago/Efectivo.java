package MetodosDePago;

public class Efectivo implements MetodoDePago {

    @Override
    public void procesarPago(double monto) {
        // Lógica para procesar el pago en efectivo
        System.out.println("Procesando pago en efectivo de: " + monto);
    }
}
