
package sistemadeestudiantes;


public class Estudiante {
    
    private String nombre;
    private String carnet;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, String carnet, double notaFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        setNotaFinal(notaFinal); // Valida el rango de la nota
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    // Setter (Valida que la nota esté entre 0 y 100)
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println( "Nota inválida. Debe estar entre 0 y 100.");
            this.notaFinal = 0; // Por defecto, si es inválida
        }
    }

    // Método para saber si el estudiante aprobó
    public boolean aprobo() {
        return notaFinal >= 61;
    }
    
}
