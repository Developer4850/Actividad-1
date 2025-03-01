
package control.de.temperatura;


public class ControlDeTemperatura {


    public static void main(String[] args) {
        
        Termómetro termometro = new Termómetro(46.5);

        System.out.println("Temperatura en Celsius: " + termometro.getTemperaturaCelsius());
        System.out.println("Temperatura en Fahrenheit: " + termometro.convertirAFahrenheit());
        System.out.println("Temperatura en Kelvin: " + termometro.convertirAKelvin());

     
    }
    
}
