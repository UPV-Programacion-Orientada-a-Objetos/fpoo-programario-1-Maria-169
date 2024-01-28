package edu.upvictoria.fpoo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumaTest {

    @Test
    public void sumar_dos_numeros_positivos() {
        int a= 10;
        int b= 15;
        assertEquals(25, Suma.sumar(a,b));
    }
    @Test
    public void sumar_dos_numeros_negativos() {
        int a= -10;
        int b= -15;
        assertEquals(-25, Suma.sumar(a,b));
    }
}