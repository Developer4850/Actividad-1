
package gestión.de.cuentas.bancarias;


public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }
    
    public void depositar(double monto){
        if (monto > 0 ){
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }
    
    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
        } else {
                        System.out.println("Fondos insuficientes o monto inválido");
        }
    }

  public double consultarSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
}
