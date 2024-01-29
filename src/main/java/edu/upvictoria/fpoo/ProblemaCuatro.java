package edu.upvictoria.fpoo;

public class ProblemaCuatro {
    private double radio;

    public ProblemaCuatro(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCircunferencia() {
        return Math.PI * Math.pow(radio, 2);
    }
}
