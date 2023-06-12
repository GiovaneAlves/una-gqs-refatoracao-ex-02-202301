package Pacote;

import java.util.Scanner;

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
 
    public String getSexo() {
        return sexo;
    }

    public void setSexo(Scanner scanner) {
        this.sexo = scanner.next().toUpperCase();;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Scanner scanner) {
        this.idade = scanner.nextInt();;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(Scanner scanner) {
        this.nome = scanner.next();;
    }
}

