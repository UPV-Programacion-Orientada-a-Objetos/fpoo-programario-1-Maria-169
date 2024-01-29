package edu.upvictoria.fpoo;

public class ProblemaSeis {
    private double hipotenusa;
    private double radioCateto;
    public ProblemaSeis(double hipotenusa, double radioCateto) {
        this.hipotenusa = hipotenusa;
        this.radioCateto = radioCateto;
    }
    public double calcularAreaFiguraA() {
        double areaTriangulo = 0.5 * radioCateto * hipotenusa;
        double areaSemicircunferencia = 0.5 * Math.PI * Math.pow(radioCateto, 2);
        return areaTriangulo * 2 + areaSemicircunferencia;
    }
}
