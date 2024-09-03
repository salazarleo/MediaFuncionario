

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("PROGRAMA FUNCIONARIO");
            System.out.println("(1) - Cadastrar Funcionario");
            System.out.println("(2) - Consultar Funcionario");
            System.out.println("(0) - Sair");
            System.out.print("Escolha uma opção: ");


            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do funcionario: ");
                    String nome = scanner.nextLine();

                    funcionario.nome = nome;

                    System.out.print("Digite a idade do funcionario: ");
                    int idade = scanner.nextInt();

                    funcionario.idade = idade;


                    funcionario.salario = new double[3];

                    for(int i = 0; i < funcionario.salario.length; i++ ) {
                        System.out.print("Digite o salario "+ (i+1) + ": ");
                        funcionario.salario[i] = scanner.nextDouble();
                    }
                    scanner.nextLine();

                    break;

                case 2:
                    if (funcionario.nome == null) {
                        System.out.println("Não existe funcionario cadastrado");
                    } else {
                        funcionario.imprimir();
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
            }
        } while (opcao != 0);

    }
}
