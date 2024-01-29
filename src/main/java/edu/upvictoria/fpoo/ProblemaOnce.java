package edu.upvictoria.fpoo;

public class ProblemaOnce {
    public static double calcularPagoTotalAgua(double anchoAlberca, double largoAlberca, double profundidadAlberca, double tarifaAguaPorMetroCubico) {
        double volumenAlberca = anchoAlberca * largoAlberca * profundidadAlberca;
        return volumenAlberca * tarifaAguaPorMetroCubico;
    }
}
