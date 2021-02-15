package com.pruebaswalter;

import java.util.Scanner;

public class EjercicioSAO {
    public static void main( String[] args ){
        int x;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese valor distinto de 0");
        do {
            x=ingreso.nextInt();//Ingreso de valores
            for (int i=1;x-1>=i;i++){
                System.out.print(i + " ");}
            if (x !=0){
                System.out.println(x);}
        }while (x !=0);


    }
}
