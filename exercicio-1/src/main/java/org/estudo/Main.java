package org.estudo;

public class Main {
    public static void main(String[] args) {
        // Toda String é um vetor
        String nome = "Silas Eliaquim Gomes de França da Silva";


        System.out.println(nome.length());

        for(int i = nome.length()-1 ; i >= 0; i--){
            System.out.println(nome.charAt(i));
        }


    }
}