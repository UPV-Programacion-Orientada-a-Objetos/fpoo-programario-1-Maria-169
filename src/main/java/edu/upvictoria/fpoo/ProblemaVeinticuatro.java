package edu.upvictoria.fpoo;

public class ProblemaVeinticuatro {
    public static void calcularAhorroAnual(double sueldoMensual) {
        double ahorroSemanal = sueldoMensual * 0.15;
        double ahorroMensual = ahorroSemanal * 4;
        double ahorroAnual = ahorroMensual * 12;

        System.out.println("El ahorro anual es: " + ahorroAnual);
    }
}
