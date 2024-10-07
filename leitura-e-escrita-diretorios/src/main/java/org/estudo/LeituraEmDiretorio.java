package org.estudo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraEmDiretorio {

    public static void main(String[] args) {

        try {
            Scanner leitor = new Scanner(new FileInputStream("tesouro"));

            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
