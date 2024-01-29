package edu.upvictoria.fpoo;

public class ProblemaTres {
    private double lado1;
    private double lado2;

    public ProblemaTres(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularAreaRectangulo() {
        return lado1 * lado2;
    }
}
