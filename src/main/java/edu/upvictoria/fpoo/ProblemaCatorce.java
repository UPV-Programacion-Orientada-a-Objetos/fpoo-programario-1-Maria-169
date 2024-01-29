package edu.upvictoria.fpoo;

import java.time.Year;

public class ProblemaCatorce {
    public static int calcularEdad(int anioNacimiento) {
        int anioActual = Year.now().getValue();
        return anioActual - anioNacimiento;
    }
}
