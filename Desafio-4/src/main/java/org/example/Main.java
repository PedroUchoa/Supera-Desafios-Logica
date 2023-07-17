package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < valor; i++) {
            String criptografada = sc.nextLine().toUpperCase();
            StringBuilder metade1 = new StringBuilder(criptografada.substring(0, criptografada.length() / 2));
            StringBuilder metade2 = new StringBuilder(criptografada.substring(criptografada.length() / 2, criptografada.length()));
            metade1.reverse();
            metade2.reverse();
            System.out.println(metade1.toString() + metade2.toString());
        }
    }
}