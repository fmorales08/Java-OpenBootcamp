package com.company;

public class functions {
    public static void main(String[] args) {
        System.out.println(precioTotal(423));

    }


    public static double precioTotal(int precio) {
        //IVA en chile 19%
        double  IVA = 1.19d ;
        return precio * IVA;

    }
}
