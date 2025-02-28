
package gestión.de.cuentas.bancarias;


public class GestiónDeCuentasBancarias {


    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 500);
        CuentaBancaria cuenta2 = new CuentaBancaria("789012", 300);

        cuenta1.depositar(200);
        cuenta1.retirar(100);

        System.out.println("Saldo cuenta1: " + cuenta1.consultarSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.consultarSaldo());
    
        
    }
    
}
