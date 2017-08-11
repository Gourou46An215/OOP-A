package com.company;

import jdk.management.resource.SimpleMeter;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double matrice[][]= createDoubleMatrice(9);
        printDoubleMatrice(matrice,3);
        System.out.println();
        printDoubleMatrice(matrice,0);
        System.out.println();
        printDoubleMatrice(matrice,1);
        System.out.println();
        printDoubleMatrice(matrice,2);

        System.out.println("\n\n----------------\n\n");

        char matriceC[][]= createCharMatrice(7);
        printCharMatrice(matriceC,3);
        System.out.println();
        printCharMatrice(matriceC,0);
        System.out.println();
        printCharMatrice(matriceC,1);
        System.out.println();
        printCharMatrice(matriceC,2);

        System.out.println("\n\n----------------\n\n");

        int matriceI[][]= createIntMatrice(5);
        printIntMatrice(matriceI,3);
        System.out.println();
        printIntMatrice(matriceI,0);
        System.out.println();
        printIntMatrice(matriceI,1);
        System.out.println();
        printIntMatrice(matriceI,2);
    }

    public static double[][] createDoubleMatrice(int length) {
        if(length%2==0) {
            length++;
        }
        double[][] matrice=new double[length][length];
        Random randomGenerator=new Random();
        for (int row=0; row<length;row++) {
            for (int col=0; col<length;col++) {
                matrice[row][col]=42+randomGenerator.nextDouble();
            }
        }
    return matrice;
    }

    public static char[][] createCharMatrice(int length) {
        if(length%2==0) {
            length++;
        }
        char[][] matrice=new char[length][length];
        Random randomGenerator=new Random();
        for (int row=0; row<length;row++) {
            for (int col=0; col<length;col++) {
                matrice[row][col]=(char)(97+randomGenerator.nextInt(26));
            }
        }
        return matrice;
    }

    public static int[][] createIntMatrice(int length) {
        if(length%2==0) {
            length++;
        }
        int[][] matrice=new int[length][length];
        Random randomGenerator=new Random();
        for (int row=0; row<length;row++) {
            for (int col=0; col<length;col++) {
                matrice[row][col]=randomGenerator.nextInt(42);
            }
        }
        return matrice;
    }



    public static void printDoubleMatrice(double[][] matrice, int printType) {
        switch(printType) {
            case 0: // Forma Normal
                System.out.println("Forma Normal - Matriz de Double :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%.3f] ",matrice[row][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 1: // Forma Caracol
                System.out.println("Forma Caracol - Matriz de Double :");
                int middle=matrice.length/2;
                System.out.printf("[%.3f] ",matrice[middle][middle]);
                for(int radius=1;radius<matrice.length/2+1;radius++){
                    // Down
                    for(int row=middle-radius+1;row<=middle+radius;row++) {
                        System.out.printf("[%.3f] ",matrice[row][middle-radius]);
                    }
                    // Right
                    for(int col=middle-radius+1;col<=middle+radius;col++) {
                        System.out.printf("[%.3f] ",matrice[middle+radius][col]);
                    }
                    // Top
                    for(int row=middle+radius-1;row>=middle-radius;row--) {
                        System.out.printf("[%.3f] ",matrice[row][middle+radius]);
                    }
                    // Left
                    for(int col=middle+radius-1;col>=middle-radius;col--) {
                        System.out.printf("[%.3f] ",matrice[middle-radius][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 2: // Forma Zig-Zag
                System.out.println("Forma Zig-Zag - Matriz de Double :");
                for (int row=0; row<matrice.length; row++) {
                    if(row%2==0) {
                        for(int col=0;col<matrice.length;col++) {
                            System.out.printf("[%.3f] ",matrice[row][col]);
                        }
                    }
                    else {
                        for(int col=matrice.length-1;col>=0;col--) {
                            System.out.printf("[%.3f] ",matrice[row][col]);
                        }
                    }
                }
                System.out.print("\n");
                break;
            case 3: // Forma Matriz
                System.out.println("Forma Matriz - Matriz de Double :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%.3f] ",matrice[row][col]);
                    }
                    System.out.print("\n");
                }
                break;
        }
    }

    public static void printCharMatrice(char[][] matrice, int printType) {
        switch(printType) {
            case 0: // Forma Normal
                System.out.println("Forma Normal - Matriz de Chars :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%c] ",matrice[row][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 1: // Forma Caracol
                System.out.println("Forma Caracol - Matriz de Chars :");
                int middle=matrice.length/2;
                System.out.printf("[%c] ",matrice[middle][middle]);
                for(int radius=1;radius<matrice.length/2+1;radius++){
                    // Down
                    for(int row=middle-radius+1;row<=middle+radius;row++) {
                        System.out.printf("[%c] ",matrice[row][middle-radius]);
                    }
                    // Right
                    for(int col=middle-radius+1;col<=middle+radius;col++) {
                        System.out.printf("[%c] ",matrice[middle+radius][col]);
                    }
                    // Top
                    for(int row=middle+radius-1;row>=middle-radius;row--) {
                        System.out.printf("[%c] ",matrice[row][middle+radius]);
                    }
                    // Left
                    for(int col=middle+radius-1;col>=middle-radius;col--) {
                        System.out.printf("[%c] ",matrice[middle-radius][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 2: // Forma Zig-Zag
                System.out.println("Forma Zig-Zag - Matriz de Chars :");
                for (int row=0; row<matrice.length; row++) {
                    if(row%2==0) {
                        for(int col=0;col<matrice.length;col++) {
                            System.out.printf("[%c] ",matrice[row][col]);
                        }
                    }
                    else {
                        for(int col=matrice.length-1;col>=0;col--) {
                            System.out.printf("[%c] ",matrice[row][col]);
                        }
                    }
                }
                System.out.print("\n");
                break;
            case 3: // Forma Matriz
                System.out.println("Forma Matriz - Matriz de Chars :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%c] ",matrice[row][col]);
                    }
                    System.out.print("\n");
                }
                break;
        }
    }


    public static void printIntMatrice(int[][] matrice, int printType) {
        switch(printType) {
            case 0: // Forma Normal
                System.out.println("Forma Normal - Matriz de Int :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%2d] ",matrice[row][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 1: // Forma Caracol
                System.out.println("Forma Caracol - Matriz de Int :");
                int middle=matrice.length/2;
                System.out.printf("[%2d] ",matrice[middle][middle]);
                for(int radius=1;radius<matrice.length/2+1;radius++){
                    // Down
                    for(int row=middle-radius+1;row<=middle+radius;row++) {
                        System.out.printf("[%2d] ",matrice[row][middle-radius]);
                    }
                    // Right
                    for(int col=middle-radius+1;col<=middle+radius;col++) {
                        System.out.printf("[%2d] ",matrice[middle+radius][col]);
                    }
                    // Top
                    for(int row=middle+radius-1;row>=middle-radius;row--) {
                        System.out.printf("[%2d] ",matrice[row][middle+radius]);
                    }
                    // Left
                    for(int col=middle+radius-1;col>=middle-radius;col--) {
                        System.out.printf("[%2d] ",matrice[middle-radius][col]);
                    }
                }
                System.out.print("\n");
                break;
            case 2: // Forma Zig-Zag
                System.out.println("Forma Zig-Zag - Matriz de Int :");
                for (int row=0; row<matrice.length; row++) {
                    if(row%2==0) {
                        for(int col=0;col<matrice.length;col++) {
                            System.out.printf("[%2d] ",matrice[row][col]);
                        }
                    }
                    else {
                        for(int col=matrice.length-1;col>=0;col--) {
                            System.out.printf("[%2d] ",matrice[row][col]);
                        }
                    }
                }
                System.out.print("\n");
                break;
            case 3: // Forma Matriz
                System.out.println("Forma Matriz - Matriz de Int :");
                for(int row=0;row<matrice.length;row++){
                    for(int col=0;col<matrice.length;col++) {
                        System.out.printf("[%2d] ",matrice[row][col]);
                    }
                    System.out.print("\n");
                }
                break;
        }
    }
}
