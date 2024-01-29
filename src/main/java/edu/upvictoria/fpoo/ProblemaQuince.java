package edu.upvictoria.fpoo;

public class ProblemaQuince {
    public static double calcularCobroEstacionamiento(double horasUtilizadas, double tarifaPorHora) {
        return redondearHaciaArriba(horasUtilizadas) * tarifaPorHora;
    }
    private static double redondearHaciaArriba(double valor) {
        return Math.ceil(valor);
    }
}
