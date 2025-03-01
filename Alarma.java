
package reloj;


public class Alarma {
    
    private int tiempoObjetivo;

    // Constructor
    public Alarma(int tiempoObjetivo) {
        this.tiempoObjetivo = tiempoObjetivo;
    }

    // Método para verificar si se debe activar la alarma
    public boolean debeActivarse(int tiempoActual) {
        return tiempoActual >= tiempoObjetivo;
    }

    // Método para mostrar el mensaje de alarma
    public void activar() {
        System.out.println(" Alarma activada! Tiempo alcanzado: " + tiempoObjetivo + " segundos.");
    }
    
}
