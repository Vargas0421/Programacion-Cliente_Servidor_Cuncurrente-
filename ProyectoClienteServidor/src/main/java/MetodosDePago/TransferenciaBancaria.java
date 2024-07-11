package MetodosDePago;

public class TransferenciaBancaria implements MetodoDePago {

    private String banco;
    private String numeroCuenta;

    public TransferenciaBancaria(String banco, String numeroCuenta) {
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void procesarPago(double monto) {
        // Lógica para procesar el pago por transferencia bancaria
        System.out.println("Procesando transferencia bancaria de: " + monto + " a la cuenta: " + numeroCuenta + " del banco: " + banco);
    }
}
