package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemaUno{
    /**
     * Constructor de la clase
     */
    public ProblemaUno() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Problema 1");
            System.out.println("Sumar dos numeros");

            System.out.print("Ingrese el primer número (a): ");
            int a = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Ingrese el segundo número (b): ");
            int b = Integer.parseInt(bufferedReader.readLine());

            // Utiliza los valores proporcionados por el usuario
            int resultado = Suma.sumar(a, b);

            System.out.println("Resultado: " + resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
