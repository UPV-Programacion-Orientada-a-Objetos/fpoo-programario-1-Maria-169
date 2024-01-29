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

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Problema 1: Suma de dos números");
            System.out.println("2. Problema 2: Calcular promedio de calificaciones");
            System.out.println("3. Problema 3: Calcular área de un rectángulo");
            System.out.println("4. Problema 4: Calcular área de una circunferencia");
            System.out.println("5. Problema 5: Calcular área de un terreno A");
            System.out.println("6. Problema 6: Calcular área de la figura A");
            System.out.println("7. Problema 7: Calcular monto a recibir por entrega de leche");
            System.out.println("8. Problema 8: Calcular distancia entre dos puntos");
            System.out.println("9. Problema 9: Calcular sueldo semanal de un trabajador");
            System.out.println("10. Problema 10: Calcular cantidad de pulgadas a pedir de tela");
            System.out.println("11. Problema 11: Calcular pago total por consumo de agua al llenar una alberca");
            System.out.println("12. Programa 12: Calcular área de un triángulo");
            System.out.println("13. Problema 13: Calcular cantidad de dólares que puede adquirir una empresa importadora");
            System.out.println("14. Problema 14: Calcular edad basada en el año de nacimiento");
            System.out.println("15. Problema 15: Calcular cobro por el uso del estacionamiento");
            System.out.println("16. Problema 16: Calcular costo por trabajos de pintura");
            System.out.println("17. Problema 17: Calcular hipotenusa de un triángulo rectángulo");
            System.out.println("18. Problema 18: Calcular costo del boleto de un viaje sencillo");
            System.out.println("19. Problema 19: Calcular tiempo de llegada en bicicleta");
            System.out.println("20. Problema 20: Calcular costo de una llamada telefónica");
            System.out.println("21. Problema 21: Calcular costo del consumo de agua");
            System.out.println("22. Problema 22: Calcular costo del consumo de energía eléctrica");
            System.out.println("23. Problema 23: Calcular precio con descuento y precio final");
            System.out.println("24. Problema 24: Calcular ahorro anual");
            System.out.println("25. Problema 25: Calcular monto total del cheque");
            System.out.println("27. Salir");

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
                        Problema5(buffer);
                        break;
                    case 6:
                        Problema6(buffer);
                        break;
                    case 7:
                        Problema7(buffer);
                        break;
                    case 8:
                        Problema8(buffer);
                        break;
                    case 9:
                        Problema9(buffer);
                        break;
                    case 10:
                        Problema10(buffer);
                        break;
                    case 11:
                        Problema11(buffer);
                        break;
                    case 12:
                        Problema12(buffer);
                        break;
                    case 13:
                        Problema13(buffer);
                        break;
                    case 14:
                        Problema14(buffer);
                        break;
                    case 15:
                        Problema15(buffer);
                        break;
                    case 16:
                        Problema16(buffer);
                        break;
                    case 17:
                        Problema17(buffer);
                        break;
                    case 18:
                        Problema18(buffer);
                        break;
                    case 19:
                        Problema19(buffer);
                        break;
                    case 20:
                        Problema20(buffer);
                        break;
                    case 21:
                        Problema21(buffer);
                        break;
                    case 22:
                        Problema22(buffer);
                        break;
                    case 23:
                        Problema23(buffer);
                        break;
                    case 24:
                        Problema24(buffer);
                        break;
                    case 25:
                        Problema25(buffer);
                        break;
                    case 27:
                        System.out.println("Saliendo.");
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

        ProblemaTres problemaTres = new ProblemaTres(lado1, lado2);
        double areaRectangulo = problemaTres.calcularAreaRectangulo();

        System.out.println("El área del rectángulo es: " + areaRectangulo);
    }

    private static void Problema4(BufferedReader buffer) throws IOException {
        System.out.println("Problema 4: Calcular área de una circunferencia");

        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = Double.parseDouble(buffer.readLine());

        ProblemaCuatro problemaCuatro = new ProblemaCuatro(radio);
        double areaCircunferencia = problemaCuatro.calcularAreaCircunferencia();

        System.out.println("El área de la circunferencia es: " + areaCircunferencia);
    }
    private static void Problema5(BufferedReader buffer) throws IOException {
        System.out.println("Problema 5: Calcular área de un terreno A");

        System.out.print("Ingrese el valor de A (base del triángulo): ");
        double baseTriangulo = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el valor de B (altura del triángulo y lado del rectángulo): ");
        double alturaTrianguloRectangulo = Double.parseDouble(buffer.readLine());

        ProblemaCinco problemaCinco = new ProblemaCinco(baseTriangulo, alturaTrianguloRectangulo);
        double areaTerrenoA = problemaCinco.calcularAreaTerrenoA();

        System.out.println("El área del terreno A es: " + areaTerrenoA);
    }
    private static void Problema6(BufferedReader buffer) throws IOException {
        System.out.println("Problema 6: Calcular área de la figura A");

        System.out.print("Ingrese el valor de H (hipotenusa): ");
        double hipotenusa = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el valor de R (radio y cateto): ");
        double radioCateto = Double.parseDouble(buffer.readLine());

        ProblemaSeis problemaSeis = new ProblemaSeis(hipotenusa, radioCateto);
        double areaFiguraA = problemaSeis.calcularAreaFiguraA();

        System.out.println("El área de la figura A es: " + areaFiguraA);
    }
    private static void Problema7(BufferedReader buffer) throws IOException {
        System.out.println("Problema 7: Calcular monto a recibir por entrega de leche");

        System.out.print("Ingrese la cantidad de leche en litros producida: ");
        double litrosProduccion = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el precio por galón: ");
        double precioPorGalon = Double.parseDouble(buffer.readLine());

        double montoARecibir = ProblemaSiete.calcularMontoARecibir(litrosProduccion, precioPorGalon);

        System.out.println("El productor recibirá $" + montoARecibir + " por la entrega de su producción diaria.");
    }
    private static void Problema8(BufferedReader buffer) throws IOException {
        System.out.println("Problema 8: Calcular distancia entre dos puntos");

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = Double.parseDouble(buffer.readLine());

        double distancia = ProblemaOcho.calcularDistanciaEntrePuntos(x1, y1, x2, y2);

        System.out.println("La distancia entre los puntos es: " + distancia);
    }
    private static void Problema9(BufferedReader buffer) throws IOException {
        System.out.println("Problema 9: Calcular sueldo semanal de un trabajador");

        System.out.print("Ingrese el número de horas trabajadas por semana: ");
        double horasTrabajadas = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el pago por hora que recibe el trabajador: ");
        double pagoPorHora = Double.parseDouble(buffer.readLine());

        double sueldoSemanal = ProblemaNueve.calcularSueldoSemanal(horasTrabajadas, pagoPorHora);

        System.out.println("El sueldo semanal es: " + sueldoSemanal);
    }
    private static void Problema10(BufferedReader buffer) throws IOException {
        System.out.println("Problema 10: Calcular cantidad de pulgadas a pedir de tela");

        System.out.print("Ingrese la cantidad de metros de tela requerida: ");
        double metrosRequeridos = Double.parseDouble(buffer.readLine());

        double pulgadasRequeridas = ProblemaDiez.calcularPulgadasRequeridas(metrosRequeridos);

        System.out.println("La cantidad de pulgadas a pedir es: " + pulgadasRequeridas);
    }
    private static void Problema11(BufferedReader buffer) throws IOException {
        System.out.println("Problema 11: Calcular pago total por consumo de agua al llenar una alberca");

        System.out.print("Ingrese el ancho de la alberca en metros: ");
        double anchoAlberca = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el largo de la alberca en metros: ");
        double largoAlberca = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la profundidad a la que se llenará la alberca en metros: ");
        double profundidadAlberca = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la tarifa de consumo de agua por metro cúbico: ");
        double tarifaAguaPorMetroCubico = Double.parseDouble(buffer.readLine());

        double pagoTotal = ProblemaOnce.calcularPagoTotalAgua(anchoAlberca, largoAlberca, profundidadAlberca, tarifaAguaPorMetroCubico);

        System.out.println("El pago total por el consumo de agua es: " + pagoTotal);
    }
    private static void Problema12(BufferedReader buffer) throws IOException {
        System.out.println("Problema 12: Calcular área de un triángulo");

        System.out.print("Ingrese la longitud de la base del triángulo: ");
        double baseTriangulo = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = Double.parseDouble(buffer.readLine());

        double areaTriangulo = ProblemaDoce.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
    private static void Problema13(BufferedReader buffer) throws IOException {
        System.out.println("Problema 13: Calcular cantidad de dólares que puede adquirir una empresa importadora");

        System.out.print("Ingrese la cantidad de dinero mexicano: ");
        double cantidadPesosMexicanos = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la tasa de cambio entre dólares y pesos mexicanos: ");
        double tasaCambioDolares = Double.parseDouble(buffer.readLine());

        double cantidadDolares = ProblemaTrece.calcularCantidadDolares(cantidadPesosMexicanos, tasaCambioDolares);

        System.out.println("La cantidad de dólares que puede adquirir es: " + cantidadDolares);
    }
    private static void Problema14(BufferedReader buffer) throws IOException {
        System.out.println("Problema 14: Calcular edad basada en el año de nacimiento");

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = Integer.parseInt(buffer.readLine());

        int edad = ProblemaCatorce.calcularEdad(anioNacimiento);

        System.out.println("La edad es: " + edad);
    }
    private static void Problema15(BufferedReader buffer) throws IOException {
        System.out.println("Problema 15: Calcular cobro por el uso del estacionamiento");

        System.out.print("Ingrese la cantidad de horas utilizadas: ");
        double horasUtilizadas = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la tarifa por hora del estacionamiento: ");
        double tarifaPorHora = Double.parseDouble(buffer.readLine());

        double cobro = ProblemaQuince.calcularCobroEstacionamiento(horasUtilizadas, tarifaPorHora);

        System.out.println("El cobro por el uso del estacionamiento es: " + cobro);
    }
    private static void Problema16(BufferedReader buffer) throws IOException {
        System.out.println("Problema 16: Calcular costo por trabajos de pintura");

        System.out.print("Ingrese la cantidad de metros cuadrados a pintar: ");
        double metrosCuadrados = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la tarifa por metro cuadrado para el trabajo de pintura: ");
        double tarifaPorMetroCuadrado = Double.parseDouble(buffer.readLine());

        double costoTotal = ProblemaDieciseis.calcularCostoPintura(metrosCuadrados, tarifaPorMetroCuadrado);

        System.out.println("El costo por el trabajo de pintura es: " + costoTotal);
    }
    private static void Problema17(BufferedReader buffer) throws IOException {
        System.out.println("Problema 17: Calcular hipotenusa de un triángulo rectángulo");

        System.out.print("Ingrese la longitud del cateto A: ");
        double longitudCatetoA = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la longitud del cateto B: ");
        double longitudCatetoB = Double.parseDouble(buffer.readLine());

        double longitudHipotenusa = ProblemaDiecisiete.calcularHipotenusa(longitudCatetoA, longitudCatetoB);

        System.out.println("La longitud de la hipotenusa es: " + longitudHipotenusa);
    }
    private static void Problema18(BufferedReader buffer) throws IOException {
        System.out.println("Problema 18: Calcular costo del boleto de un viaje sencillo");

        System.out.print("Ingrese la cantidad de kilómetros a recorrer: ");
        double kilometrosRecorrer = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el costo por kilómetro: ");
        double costoPorKilometro = Double.parseDouble(buffer.readLine());

        double costoTotal = ProblemaDieciocho.calcularCostoBoleto(kilometrosRecorrer, costoPorKilometro);

        System.out.println("El costo del boleto para el viaje es: " + costoTotal);
    }
    private static void Problema19(BufferedReader buffer) throws IOException {
        System.out.println("Problema 19: Calcular tiempo de llegada en bicicleta");

        System.out.print("Ingrese la distancia entre las dos ciudades (en kilómetros): ");
        double distanciaCiudades = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese la velocidad constante en bicicleta (en kilómetros por hora): ");
        double velocidadBicicleta = Double.parseDouble(buffer.readLine());

        double tiempo = ProblemaDiecinueve.calcularTiempoBicicleta(distanciaCiudades, velocidadBicicleta);

        System.out.println("El tiempo requerido para llegar es: " + tiempo + " horas");
    }
    private static void Problema20(BufferedReader buffer) throws IOException {
        System.out.println("Problema 20: Calcular costo de una llamada telefónica");

        System.out.print("Ingrese la duración de la llamada telefónica (en minutos): ");
        double duracionLlamada = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el costo por minuto de la llamada telefónica: ");
        double costoPorMinuto = Double.parseDouble(buffer.readLine());

        double costoTotal = ProblemaVeinte.calcularCostoLlamada(duracionLlamada, costoPorMinuto);

        System.out.println("El costo total de la llamada es: " + costoTotal);
    }

    private static void Problema21(BufferedReader buffer) throws IOException {
        System.out.println("Problema 21: Calcular costo del consumo de agua");

        System.out.print("Ingrese la cantidad de metros cúbicos de agua consumidos: ");
        double metrosCubicosConsumidos = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el costo por metro cúbico de agua: ");
        double costoPorMetroCubico = Double.parseDouble(buffer.readLine());

        double costoTotal = ProblemaVeintiuno.calcularCostoAgua(metrosCubicosConsumidos, costoPorMetroCubico);

        System.out.println("El costo total del consumo de agua es: " + costoTotal);
    }
    private static void Problema22(BufferedReader buffer) throws IOException {
        System.out.println("Problema 22: Calcular costo del consumo de energía eléctrica");

        System.out.print("Ingrese la cantidad de kilowatts consumidos: ");
        double kilowattsConsumidos = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el costo por kilowatt-hora: ");
        double costoPorKilowattHora = Double.parseDouble(buffer.readLine());

        double costoTotal = ProblemaVeintidos.calcularCostoElectricidad(kilowattsConsumidos, costoPorKilowattHora);

        System.out.println("El costo total del consumo de energía eléctrica es: " + costoTotal);
    }
    private static void Problema23(BufferedReader buffer) throws IOException {
        System.out.println("Problema 23: Calcular precio con descuento y precio final");

        System.out.print("Ingrese el precio original del artículo: ");
        double precioOriginal = Double.parseDouble(buffer.readLine());

        // Utilizar la nueva clase para realizar los cálculos y mostrar los resultados
        ProblemaVeintitres.calcularPrecioDescuentoIVA(precioOriginal);
    }
    private static void Problema24(BufferedReader buffer) throws IOException {
        System.out.println("Problema 24: Calcular ahorro anual");

        System.out.print("Ingrese el sueldo mensual de la persona: ");
        double sueldoMensual = Double.parseDouble(buffer.readLine());

        ProblemaVeinticuatro.calcularAhorroAnual(sueldoMensual);
    }
    private static void Problema25(BufferedReader buffer) throws IOException {
        System.out.println("Problema 25: Calcular monto total del cheque");

        System.out.print("Ingrese el número de días que el empleado estará en Monterrey: ");
        int numeroDias = Integer.parseInt(buffer.readLine());

        System.out.print("Ingrese el costo diario del hotel: ");
        double costoDiarioHotel = Double.parseDouble(buffer.readLine());

        System.out.print("Ingrese el costo diario de la comida: ");
        double costoDiarioComida = Double.parseDouble(buffer.readLine());

        ProblemaVeinticinco.calcularMontoCheque(numeroDias, costoDiarioHotel, costoDiarioComida);
    }

    private static double obtenerCalificacion(BufferedReader buffer) throws IOException {
        return Double.parseDouble(buffer.readLine());
    }
}