package Pacote;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Informe a idade do cliente: ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);

        System.out.print("Informe o sexo do cliente (M/F): ");
        String sexo = scanner.next();
        pessoa.setSexo(sexo);

        Academia academia = new Academia();
        academia.calcularMensalidade(pessoa);

        double mensalidade = academia.getMensalidade();

        if (mensalidade > 0) {
            System.out.println("Valor da mensalidade: R$" + mensalidade);
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}
