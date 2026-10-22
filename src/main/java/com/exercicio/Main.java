package main.java.com.exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Path arquivo = Path.of("dados.txt");

        try (BufferedReader leitor = Files.newBufferedReader(
                arquivo, StandardCharsets.UTF_8)) {

            System.out.println(
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            );
            System.out.println("<pessoas>");

            String linha;
            int numeroLinha = 0;

            while ((linha = leitor.readLine()) != null) {
                numeroLinha++;

                if (linha.isBlank()) {
                    continue;
                }

                String[] dados = linha.split(";", -1);

                if (dados.length != 3) {
                    System.err.println(
                            "Linha inválida: " + numeroLinha
                    );
                    continue;
                }

                try {
                    String nome = dados[0].trim();
                    int idade = Integer.parseInt(
                            dados[1].trim()
                    );
                    String email = dados[2].trim();

                    Pessoa pessoa = new Pessoa(
                            nome, idade, email
                    );

                    System.out.println(pessoa.toXml());

                } catch (NumberFormatException e) {
                    System.err.println(
                            "Idade inválida na linha " + numeroLinha
                    );
                }
            }

            System.out.println("</pessoas>");

        } catch (IOException e) {
            System.err.println(
                    "Erro ao ler arquivo: " + e.getMessage()
            );
        }
    }
}
