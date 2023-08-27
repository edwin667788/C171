package B4;

import B2.Estudiante;

import java.util.Scanner;

public class TrabajoFinal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            try {

                System.out.println("Formulario de Registro de la Universidad");

                System.out.print("Ingresa Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Tu Apellido: ");
                String apellido = sc.nextLine();

                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();

                System.out.print("Cédula: ");
                String cedula = sc.nextLine();

                System.out.print("Promedio de notas escolares: ");
                double promedio = sc.nextDouble();
                sc.nextLine();

                System.out.print("Carrera a cursar: ");
                String carrera = sc.nextLine();

                System.out.println("Registrado exitosamente.");

                if (promedio >= 3) {
                    System.out.println("¡Felicidades! Estás aprobado en la universidad.");
                } else {
                    System.out.println("Lo sentimos, no estás aprobado en la universidad.");
                }

                System.out.print("marca s, si deseas registrarte denuevo a otro programa o no para salir? (s/n): ");
                String respuesta = sc.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error. Por favor, intenta de nuevo.");
                sc.nextLine();
            }
        }
        System.out.println("Felicitacione, estas registrado");
        sc.close();

    }
}
