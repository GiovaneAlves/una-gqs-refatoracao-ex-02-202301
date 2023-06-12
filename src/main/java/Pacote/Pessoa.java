package Pacote;

public class Pessoa {
    private String sexo;
    private int idade;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String sexo, int idade, String nome) {
        this.sexo = sexo;
        this.idade = idade;
        this.nome = nome;
    }

    public boolean isMulher() {
        return sexo.equalsIgnoreCase("F");
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

