package main.java.com.exercicio;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String toXml() {
        return "  <pessoa>\n" +
                "    <nome>" + escaparXml(nome) + "</nome>\n" +
                "    <idade>" + idade + "</idade>\n" +
                "    <email>" + escaparXml(email) + "</email>\n" +
                "  </pessoa>";
    }

    private String escaparXml(String texto) {
        return texto.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
    }
}
