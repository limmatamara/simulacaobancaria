package simulacaoBancaria;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
        	System.out.println("Digite a opção desejada: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                	System.out.println("Digite o valor do deposito: ");
                    int deposito = scanner.nextInt();
                    saldo = saldo + deposito;
                    System.out.printf("Saldo atual: " + "%.1f", saldo );
                    System.out.println();
                    break;
                case 2:
                	System.out.println("Digite o valor do saque: ");
                    int saque = scanner.nextInt();
                    if (saldo >= saque){
                      saldo = saldo - saque;
                       System.out.printf("Saldo atual: " + "%.1f", saldo );
                       System.out.println();
                      
                    } else {
                      System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: " + "%.1f", saldo );
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
