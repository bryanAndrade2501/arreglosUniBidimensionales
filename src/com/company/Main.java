package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Dado un array de números de 5 posiciones con los siguiente valores {1,2,3,4,5}.
        // Guardar los valores de este array en otro array distinto pero con los valores invertidos,
        //es decir, que el segundo array deberá tener los valores {5,4,3,2,1}. Ejemplo:
        //TODO: EJERCICIO 3
        int array1[] = {1, 2, 3, 4, 5};
        System.out.println("Arreglo inicial");
        mostrarArray(array1);
        int[] array2 = new int[array1.length];
        for (int i = (array1.length - 1), j = 0; i >= 0; i--, j++) {
            array2[j] = array1[i];
        }
        System.out.println("Arreglo invertido");
        mostrarArray(array2);

    }

    public static void mostrarArray(int lista[]) {
        System.out.print("{ ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(+lista[i] + " ");
        }
        System.out.println("}");
    }
}
