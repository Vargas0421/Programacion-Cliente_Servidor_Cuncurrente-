package MetodosDePago;

public class TransferenciaBancaria implements MetodoDePago {

    private String banco;
    private int numeroCuenta;

    public TransferenciaBancaria(String banco, int numeroCuenta) {
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    public TransferenciaBancaria() {
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void procesarPago(double monto) {
        // Lógica para procesar el pago por transferencia bancaria
        System.out.println("Procesando transferencia bancaria de: " + monto + " a la cuenta: " + numeroCuenta + " del banco: " + banco);
    }
}
