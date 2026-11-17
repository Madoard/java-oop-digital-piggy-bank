//Aluna: Maria Eduarda Gonçalves Santos
//RU: 5249042

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        // Exibição do Menu Inicial
        System.out.println("---- MENU COFRINHO ----");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Calcular total convertido para Real");
        System.out.println("0 - Encerrar");

        opcao = teclado.nextInt();

        while (opcao != 0) {

            switch (opcao) {
                case 1: // Adicionar
                    System.out.println("Escolha a Moeda:");
                    System.out.println("1 - Real");
                    System.out.println("2 - Dólar");
                    System.out.println("3 - Euro");
                    int tipoMoeda = teclado.nextInt();

                    System.out.println("Digite o valor:");
                    double valorMoeda = teclado.nextDouble();

                    Moeda moeda = null;
                    if (tipoMoeda == 1) {
                        moeda = new Real(valorMoeda);
                    } else if (tipoMoeda == 2) {
                        moeda = new Dolar(valorMoeda);
                    } else if (tipoMoeda == 3) {
                        moeda = new Euro(valorMoeda);
                    } else {
                        System.out.println("Moeda inválida!");
                    }

                    if (moeda != null) {
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda adicionada!");
                    }
                    break;

                case 2: // Remover
                    System.out.println("Escolha o tipo (1-Real, 2-Dólar, 3-Euro):");
                    int tipoRemover = teclado.nextInt();
                    System.out.println("Digite o valor exato:");
                    double valorRemover = teclado.nextDouble();

                    Moeda remover = null;
                    if (tipoRemover == 1) {
                        remover = new Real(valorRemover);
                    } else if (tipoRemover == 2) {
                        remover = new Dolar(valorRemover);
                    } else if (tipoRemover == 3) {
                        remover = new Euro(valorRemover);
                    }

                    if (remover != null) {
                        cofrinho.remover(remover);
                        System.out.println("Tentativa de remoção concluída.");
                    }
                    break;

                case 3: // Listar
                    System.out.println("Lista de Moedas no Cofrinho:");
                    cofrinho.listagemMoedas();
                    break;

                case 4: // Total
                    double total = cofrinho.totalConvertido();
                    System.out.printf("Total acumulado no cofrinho (em Real): R$ %.2f\n", total);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("\nEscolha outra opção (1-Add, 2-Rem, 3-List, 4-Total, 0-Sair):");
            opcao = teclado.nextInt();
        }

        System.out.println("Sistema encerrado. Até logo!");
        teclado.close();
    }
}