package org.estudo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class EscritaEmDiretorio {

    public static void main(String[] args) {

        System.out.println("Digite o nome do Arquivo com seu tipo de extensão");
        Scanner teclado = new Scanner(System.in);
        try {

            String nomeArquivo = teclado.nextLine();
            //Assim voce sempre ira sobreEscrever o que ja tem dentro do arquivo
            PrintStream escrever = new PrintStream(nomeArquivo);

            //Passando o parametro true voce diz que é permitido escrever coisas novas no arquivo que voce disse
            PrintStream semSobreEscrever = new PrintStream(new FileOutputStream(nomeArquivo, true));

            System.out.println("Escreva algo dentro do arquivo");
            String dentro = teclado.nextLine();
            escrever.println(dentro);

            escrever.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        teclado.close();

    }
}
