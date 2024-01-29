package edu.upvictoria.fpoo;

public class ProblemaSeis {
    private double hipotenusa;
    private double radioCateto;

    public ProblemaSeis(double hipotenusa, double radioCateto) {
        this.hipotenusa = hipotenusa;
        this.radioCateto = radioCateto;
    }

    public double calcularAreaFiguraA() {
        // Calcular área del triángulo rectángulo
        double areaTriangulo = 0.5 * radioCateto * hipotenusa;

        // Calcular área de la semicircunferencia
        double areaSemicircunferencia = 0.5 * Math.PI * Math.pow(radioCateto, 2);

        // Calcular área total de la figura A
        return areaTriangulo * 2 + areaSemicircunferencia;
    }
}
