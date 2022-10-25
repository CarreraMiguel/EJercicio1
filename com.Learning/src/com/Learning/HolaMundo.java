package com.Learning;

public class HolaMundo {
    public static void main(String[] args) {
        // El Iva de vivienda siempre es 10%
        System.out.println("El precio final es: " + precioVivienda(1000000, 1.1) + " €.");
    }
    public static double precioVivienda(double precio, double iva){
        return precio * iva;
    }
}