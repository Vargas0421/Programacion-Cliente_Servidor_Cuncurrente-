
package MetodosDePago;

public class Tarjeta implements MetodoDePago {

    private int  numeroTarjeta;
    private int fechaExpiracion;
    private int cvv;

    public Tarjeta(int numeroTarjeta, int fechaExpiracion, int cvv) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.cvv = cvv;
    }

    public Tarjeta() {
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(int fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    
    @Override
    public void procesarPago(double monto) {
        // Lógica para procesar el pago con tarjeta de crédito
        System.out.println("Procesando pago con tarjeta de crédito de: " + monto + " usando la tarjeta: " + numeroTarjeta);
    }
}
