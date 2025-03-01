
package reloj;


public class Reloj {


    public static void main(String[] args) {
        
          // Crear el temporizador
        Temporizador temporizador = new Temporizador();

        // Crear una alarma que se active a los 5 segundos
        Alarma alarma = new Alarma(5);

        // Asociar la alarma al temporizador
        temporizador.asociarAlarma(alarma);

        // Iniciar el temporizador
        temporizador.iniciar();
    }
    
}
