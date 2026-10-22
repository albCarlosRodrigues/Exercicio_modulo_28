Exercício Módulo 28 — Leitura de Arquivos e Conversão XML

Projeto desenvolvido em Java para realizar a leitura de dados de um arquivo TXT, convertê-los em objetos Java (POJO) e exibi-los no formato XML.

Funcionalidades

Leitura de arquivos TXT linha por linha.

Separação dos dados utilizando ponto e vírgula (;).

Conversão dos registros em objetos da classe Pessoa.

Geração e exibição dos dados em formato XML.

Tratamento básico de erros na leitura dos dados.

Tecnologias

Java

Programação Orientada a Objetos (POO)

API de arquivos do Java (java.nio.file)

Como executar

Na raiz do projeto, compile os arquivos:

javac -encoding UTF-8 -d out src/main/java/com/exercicio/Pessoa.java src/main/java/com/exercicio/Main.java

Execute o programa:

java -cp out main.java.com.exercicio.Main

Estrutura dos dados

O arquivo dados.txt contém um registro por linha, utilizando o formato:

Carlos;24;carlos@email.com
Ana;28;ana@email.com
Pedro;32;pedro@email.com

Cada registro é convertido em um objeto Pessoa e representado em XML.