package com.pruebaswalter;
import java.util.Scanner;

public class EjercicioSAO2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int filas, columnas, sumafila, sumacol;
        int mayor = 0;
        System.out.println("Ingrese cantidad de filas:");
        filas = entrada.nextInt();
        System.out.println("Ingrese cantidad de columnas:");
        columnas = entrada.nextInt();
        int[][] matlomb = new int[filas][columnas];
        System.out.println("Ingrese valores de la matriz de lombrices:");
        for (int f = 0; f < matlomb.length; f++) {
            for (int c = 0; c < matlomb[f].length; c++) {
                matlomb[f][c] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matlomb.length; i++) {
            sumafila = 0;

            for (int j = 0; j < matlomb[i].length; j++) {
                sumafila = sumafila + matlomb[i][j];
                if (sumafila > mayor)
                    mayor = sumafila;
            }
        }

        for (int i = 0; i < matlomb[0].length; i++) {
            sumacol = 0;
            for (int j = 0; j < matlomb.length; j++) {
                sumacol = sumacol + matlomb[j][i];
                if (sumacol > mayor)
                    mayor = sumacol;
            }
        }
        System.out.println("La cantidad cosechada de lombrices es: " + mayor);
    }
}
