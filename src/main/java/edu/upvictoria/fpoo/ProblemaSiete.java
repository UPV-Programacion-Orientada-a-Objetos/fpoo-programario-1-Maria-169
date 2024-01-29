package edu.upvictoria.fpoo;

public class ProblemaSiete {
    private static final double GALONES_POR_LITRO = 3.785;

    public static double calcularMontoARecibir(double litrosProduccion, double precioPorGalon) {
        double galonesProduccion = litrosProduccion / GALONES_POR_LITRO;
        return galonesProduccion * precioPorGalon;
    }
}
