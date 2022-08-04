package com.company;

public class Main {

    public static void main(String[] args){
        printDataTypes();
    }

    private static void printDataTypes() {
        byte n1 = 1;
        short n2 = 2;
        int n3 = 3;
        long n4 = 4;

        float dec1 = 450.2f;
        double dec2 = 450.33d;

        char caracter ='a';

        boolean v = true;
        boolean f = false;

        String name = "Fabian";

        Integer num = null;
        Long numLong = 2L;


        System.out.println("Los tipos de datos son: Enteros: "+n1 + ", " + n2 + ", " + n3+", " + n4 + ", " + dec1 + ","
+ dec2 + ", " + caracter +", " + v + ", " + f+", " + name+", " + num + ", " +numLong);}
}
