package org.example;


import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double valor = sc.nextDouble();

        System.out.println("NOTAS:");
        valor = notas(valor, 100.00);
        valor = notas(valor, 50.00);
        valor = notas(valor, 20.00);
        valor = notas(valor, 10.00);
        valor = notas(valor, 5.00);
        valor = notas(valor, 2.00);

        System.out.println("MOEDAS:");
        valor = moedas(valor, 1.00);
        valor = moedas(valor, 0.50);
        valor = moedas(valor, 0.25);
        valor = moedas(valor, 0.10);
        valor = moedas(valor, 0.05);
        moedas(valor, 0.01);
    }

    public static Double notas(Double valor, Double valorDaNota){
        int notas = 0;
        DecimalFormat df = new DecimalFormat("0.00");
        while(valor.intValue()/valorDaNota.intValue() > 0){
            valor -= valorDaNota;
            notas++;
        }
        System.out.println(notas + " nota(s) de R$ " + String.format("%.2f",valorDaNota));
        return valor;
    }

    public static Double moedas(Double valor, Double valorEmCentavos){
        int centavos = 0;
        while(valor-valorEmCentavos >=0){
            valor -= valorEmCentavos;
            centavos++;
        }
        System.out.println(centavos + " moeda(s) de R$ " + String.format("%.2f", valorEmCentavos));
        return valor;
    }

}