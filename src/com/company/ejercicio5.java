package com.company;

import java.text.DecimalFormat;

public class ejercicio5 {
    public static void main(String[] args) {
        //Crear una matriz de 3x4. Rellenar la matriz automáticamente con números aleatorios.
        //Los valores serán números decimales mayores o iguales a 0 y menores de 10.
        //Finalmente imprimir los valores de la matriz (2 decimales). Deberá también imprimir
        //el número de la fila. Ejemplo:

        double matriz [][] = new double[3][4];
        rellenarMatriz(matriz);
    }

    public static void rellenarMatriz(double matriz [][]){
        DecimalFormat df2 = new DecimalFormat(".##");
        for(int i=0; i<matriz.length;i++){
            System.out.print("Fila "+i+" --> ");
            for(int j=0; j<matriz[0].length;j++){
                double randomValue = ((Math.random( ) * 9)+1);
                matriz[i][j] = (randomValue);
                System.out.print(df2.format(matriz[i][j]) + "  ");
            }
            System.out.println("");
        }
    }

}
