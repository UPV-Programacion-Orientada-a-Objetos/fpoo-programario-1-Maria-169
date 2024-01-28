package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world.
 */
public class App
{
    public static void main(String[] args) {
        int a, b;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Ingrese el primer número (a): ");
            a = Integer.parseInt(buffer.readLine());

            System.out.print("Ingrese el segundo número (b): ");
            b = Integer.parseInt(buffer.readLine());

            int resultado = Suma.sumar(a, b);
            System.out.println("La suma de " + a + " y " + b + " es: " +12 resultado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
