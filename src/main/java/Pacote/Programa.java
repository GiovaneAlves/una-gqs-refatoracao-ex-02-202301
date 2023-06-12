package Pacote;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Informe a idade do cliente: ");
        pessoa.setIdade(scanner);

        System.out.print("Informe o sexo do cliente (M/F): ");
        pessoa.setSexo(scanner);

        Academia academia = new Academia();
        academia.calcularMensalidade(pessoa);

        if (academia.getMensalidade() > 0) {
            System.out.println("Valor da mensalidade: R$" + academia.getMensalidade());
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}
