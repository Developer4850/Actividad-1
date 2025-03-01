    
package reloj;


public class Temporizador {
 
    private int tiempoActual;
    private Alarma alarma;

    // Constructor
    public Temporizador() {
        this.tiempoActual = 0;
    }

    // Método para asociar una alarma al temporizador
    public void asociarAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    // Método para iniciar el temporizador
    public void iniciar() {
        System.out.println("⏳ Temporizador iniciado...");

        while (true) {
            try {
                Thread.sleep(1000); // Espera 1 segundo
                tiempoActual++;
                System.out.println("Tiempo: " + tiempoActual + " segundos");

                // Verifica si la alarma debe activarse
                if (alarma != null && alarma.debeActivarse(tiempoActual)) {
                    alarma.activar();
                    break; // Detiene el temporizador después de activar la alarma
                }
            } catch (InterruptedException e) {
                System.out.println("Error en el temporizador.");
            }
        }
    }
    
}
