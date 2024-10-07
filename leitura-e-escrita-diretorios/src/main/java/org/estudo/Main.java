package org.estudo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva algo abaixo");
        String mensagem = teclado.nextLine();
        System.out.println(mensagem);

        teclado.close();

    }
}