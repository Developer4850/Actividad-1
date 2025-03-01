
package sistemadeestudiantes;


public class SistemaDeEstudiantes {


    public static void main(String[] args) {
        
         // Crear el curso
        Clase curso = new Clase();

        // Agregar estudiantes al curso
        curso.agregarEstudiante(new Estudiante("Mellanie Fuentes", "2023001", 85));
        curso.agregarEstudiante(new Estudiante("Alison Cifuentes", "2023002", 45));
        curso.agregarEstudiante(new Estudiante("Judit Barrios", "2023003", 75));
        curso.agregarEstudiante(new Estudiante("Astrid Cifuentes", "2023004", 60));
        curso.agregarEstudiante(new Estudiante("Derik Aguilar", "2023005", 110)); // Nota inválida

        // Mostrar los estudiantes
        curso.mostrarEstudiantes();

        // Calcular y mostrar el promedio del curso
        System.out.println("\n Promedio del curso: " + curso.calcularPromedio());

        // Mostrar los estudiantes aprobados
        curso.mostrarEstudiantesAprobados();
    }
    
}
