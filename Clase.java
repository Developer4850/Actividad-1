
package sistemadeestudiantes;

import java.util.ArrayList;

public class Clase {
    
     private ArrayList<Estudiante> estudiantes;

    // Constructor (inicializa la lista de estudiantes)
    public Clase() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para calcular el promedio del curso
    public double calcularPromedio() {
        if (estudiantes.isEmpty()) {
            System.out.println("⚠️ No hay estudiantes en el curso.");
            return 0.0;
        }

        double sumaNotas = 0;
        for (Estudiante e : estudiantes) {
            sumaNotas += e.getNotaFinal();
        }
        return sumaNotas / estudiantes.size();
    }

    // Método para mostrar los estudiantes aprobados (nota >= 61)
    public void mostrarEstudiantesAprobados() {
        System.out.println("📊 Estudiantes aprobados:");
        for (Estudiante e : estudiantes) {
            if (e.aprobo()) {
                System.out.println(e.getNombre() + " (Carnet: " + e.getCarnet() + ") - Nota: " + e.getNotaFinal());
            }
        }
    }

    // Método para mostrar todos los estudiantes del curso
    public void mostrarEstudiantes() {
        System.out.println("📋 Lista de estudiantes en el curso:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " (Carnet: " + e.getCarnet() + ") - Nota: " + e.getNotaFinal());
        }
    }
}

