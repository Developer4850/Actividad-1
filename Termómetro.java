
package control.de.temperatura;


public class Termómetro {
    
    private double temperaturaCelsius;

    public Termómetro(double temperaturaInicial) {
        this.temperaturaCelsius = temperaturaInicial;
    }

    public double getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(double temperatura) {
        this.temperaturaCelsius = temperatura;
    }

    public double convertirAFahrenheit() {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public double convertirAKelvin() {
        return temperaturaCelsius + 273.15;
    }

    public boolean esFiebre() {
        return temperaturaCelsius > 37.5;
    }
    
}
