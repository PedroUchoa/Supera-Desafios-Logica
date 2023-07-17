package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = adicionarValores(sc);

        List<Integer> pares = valores.stream().filter(x -> x%2 ==0).sorted().collect(Collectors.toList());
        List<Integer> impares = valores.stream().filter(x -> x%2 !=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        ArrayList<Integer> valoresOrganizados = new ArrayList<>();
        valoresOrganizados.addAll(pares);
        valoresOrganizados.addAll(impares);

        valoresOrganizados.forEach(x ->{
            System.out.println(x);
        });

    }

    public static ArrayList<Integer> adicionarValores( Scanner sc){
        Integer valorFixo = sc.nextInt();
        ArrayList<Integer> valores = new ArrayList<Integer>();
        for (int i = 0; i < valorFixo; i++){
            int valor = sc.nextInt();
            valores.add(valor);
        }
        return valores;
    }

}