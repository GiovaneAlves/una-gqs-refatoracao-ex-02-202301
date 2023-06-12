package Pacote;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Academia academia = new Academia();
        
        System.out.print("Informe a idade do cliente: ");
        pessoa.setIdade(scanner);

        System.out.print("Informe o sexo do cliente (M/F): ");
        pessoa.setSexo(scanner);

        academia.calcularMensalidade(pessoa);

        academia.mensagem();

        scanner.close();
    }
}
