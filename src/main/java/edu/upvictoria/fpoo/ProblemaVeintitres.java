package edu.upvictoria.fpoo;

public class ProblemaVeintitres {
    public static void calcularPrecioDescuentoIVA(double precioOriginal) {
        double descuento = precioOriginal * 0.20;
        double precioConDescuento = precioOriginal - descuento;
        double iva = precioConDescuento * 0.15;
        double precioFinal = precioConDescuento + iva;
        System.out.println("El precio con descuento es: " + precioConDescuento);
        System.out.println("El precio final es: " + precioFinal);
    }
}
