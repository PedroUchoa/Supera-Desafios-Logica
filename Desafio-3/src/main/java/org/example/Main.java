package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int valorArray = sc.nextInt();
        int valorAlvo = sc.nextInt();
        int totalDePares = 0;
        int[] arrayValores = new int[valorArray];
        for(int i = 0; i <arrayValores.length; i++){
            arrayValores[i] =i+1;
        }

        for (int j = arrayValores.length-1; j >=0; j--){
            for (int k = 0; k < arrayValores.length; k++){
                if (arrayValores[j] - arrayValores[k] == valorAlvo){
                    totalDePares++;
                }
            }
        }
        System.out.println(totalDePares);
    }
}