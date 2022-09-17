package com.company;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int matriz[][] = cargar();
        imprimir(matriz);
        imprimirUltimaFila(matriz);
        reemplazarValor(matriz);
        imprimir(matriz);
    }

    public static int[][] cargar() {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas filas tiene la matriz: ");
        n = Integer.parseInt(scanner.nextLine());
        System.out.print("Cuantas columnas tiene la matriz: ");
        m = Integer.parseInt(scanner.nextLine());
        int matriz[][] = new int[n][m];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int randomValue = (int) ((Math.random() * 9) + 1);
                matriz[i][j] = (randomValue);
            }
        }
        return matriz;
    }

    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            //System.out.print("Fila "+i+" --> ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void imprimirUltimaFila(int matriz[][]) {
        System.out.println("Ultima fila de la matriz");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[matriz.length - 1][i] + "  ");
        }
        System.out.println("");
    }

    public static void reemplazarValor(int matriz[][]) {
        int n, m;
        boolean bandera = false;
        while (!bandera) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Se va a reemplazar un valor de la matriz");
            System.out.print("Fila a reemplazar: ");
            n = Integer.parseInt(scanner.nextLine());
            System.out.print("Columna a reemplazar: ");
            m = Integer.parseInt(scanner.nextLine());
            if (n <= matriz.length && m <= matriz[0].length) {
                matriz[n - 1][m - 1] = 100;
                bandera = true;
            } else {
                System.out.println("La fila o columna no existe");
            }
        }
    }
}
