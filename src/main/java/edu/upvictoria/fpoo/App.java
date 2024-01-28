package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world.
 */
public class App {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // Menú
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Problema 1: Suma de dos números");
            System.out.println("2. Problema 2: Calcular promedio de calificaciones");
            System.out.println("3. Problema 3: Calcular área de un rectángulo");
            System.out.println("4. Problema 4: Calcular área de una circunferencia");
            System.out.println("5. Salir");

            try {
                int opcion = Integer.parseInt(buffer.readLine());

                switch (opcion) {
                    case 1:
                        Problema1(buffer);
                        break;
                    case 2:
                        Problema2(buffer);
                        break;
                    case 3:
                        Problema3(buffer);
                        break;
                    case 4:
                        Problema4(buffer);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Inténtelo de nuevo.");
                        break;
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    private static void Problema1(BufferedReader buffer) throws IOException {
        System.out.println("Problema 1: Suma de dos números");
        System.out.print("Ingrese el primer número (a): ");
        int a = Integer.parseInt(buffer.readLine());

        System.out.print("Ingrese el segundo número (b): ");
        int b = Integer.parseInt(buffer.readLine());

        int resultado = Suma.sumar(a, b);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }

    private static void Problema2(BufferedReader buffer) throws IOException {
        System.out.println("Problema 2: Calcular promedio de calificaciones");

        // Ciclo para ingresar las calificaciones
        double examen1, examen2, examen3, examen4;

        do {
            System.out.print("Ingrese la calificación del examen 1: ");
            examen1 = obtenerCalificacion(buffer);

            System.out.print("Ingrese la calificación del examen 2: ");
            examen2 = obtenerCalificacion(buffer);

            System.out.print("Ingrese la calificación del examen 3: ");
            examen3 = obtenerCalificacion(buffer);

            System.out.print("Ingrese la calificación del examen 4: ");
            examen4 = obtenerCalificacion(buffer);

            if (examen1 < 0 || examen1 > 100 || examen2 < 0 || examen2 > 100 ||
                    examen3 < 0 || examen3 > 100 || examen4 < 0 || examen4 > 100) {
                System.out.println("Ingrese calificaciones válidas (entre 0 y 100).");
            }
        } while (examen1 < 0 || examen1 > 100 || examen2 < 0 || examen2 > 100 ||
                examen3 < 0 || examen3 > 100 || examen4 < 0 || examen4 > 100);

        ProblemaDos problemaDos = new ProblemaDos(examen1, examen2, examen3, examen4);

        double calificacion1 = problemaDos.getExamen1();
        double calificacion2 = problemaDos.getExamen2();
        double calificacion3 = problemaDos.getExamen3();
        double calificacion4 = problemaDos.getExamen4();

        Promedio promedioCal = new Promedio();
        double promedio = promedioCal.calcularPromedio(calificacion1, calificacion2, calificacion3, calificacion4);

        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
    private static void Problema3(BufferedReader buffer) throws IOException {
        System.out.println("Problema 3: Calcular área de un rectángulo");

        System.out.print("Ingrese la longitud del lado 1 del rectángulo: ");
        double lado1 = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la longitud del lado 2 del rectángulo: ");
        double lado2 = Double.parseDouble(buffer.readLine());

        double areaRectangulo = lado1 * lado2;
        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }

    private static void Problema4(BufferedReader buffer) throws IOException {
        System.out.println("Problema 4: Calcular área de una circunferencia");

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = Double.parseDouble(buffer.readLine());

        double areaCir = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de la circunferencia es: " + areaCir);
    }

    private static double obtenerCalificacion(BufferedReader buffer) throws IOException {
        return Double.parseDouble(buffer.readLine());
    }
}