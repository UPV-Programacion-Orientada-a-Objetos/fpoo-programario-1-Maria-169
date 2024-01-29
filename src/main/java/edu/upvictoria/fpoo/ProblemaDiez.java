package edu.upvictoria.fpoo;

public class ProblemaDiez{
    private static final double RELACION_PULGADAS_METROS = 0.0254;

    public static double calcularPulgadasRequeridas(double metrosRequeridos) {
        return metrosRequeridos / RELACION_PULGADAS_METROS;
    }
}
