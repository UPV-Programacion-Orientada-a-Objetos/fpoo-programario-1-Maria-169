package edu.upvictoria.fpoo;

public class ProblemaCinco {
    private double baseTriangulo;
    private double alturaTrianguloRectangulo;

    public ProblemaCinco(double baseTriangulo, double alturaTrianguloRectangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTrianguloRectangulo = alturaTrianguloRectangulo;
    }

    public double calcularAreaTerrenoA() {
        double areaTriangulo = 0.5 * baseTriangulo * alturaTrianguloRectangulo;
        double areaRectangulo = baseTriangulo * alturaTrianguloRectangulo;
        return areaTriangulo + areaRectangulo;
    }
}
