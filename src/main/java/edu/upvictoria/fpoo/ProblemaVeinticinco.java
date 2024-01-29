package edu.upvictoria.fpoo;

public class ProblemaVeinticinco {
    public static void calcularMontoCheque(int numeroDias, double costoDiarioHotel, double costoDiarioComida) {
        double montoOtrosGastos = 100.00 * numeroDias;
        double montoHotel = costoDiarioHotel * numeroDias;
        double montoComida = costoDiarioComida * numeroDias;

        double montoTotal = montoOtrosGastos + montoHotel + montoComida;
        System.out.println("El monto total del cheque es: " + montoTotal);
    }
}
