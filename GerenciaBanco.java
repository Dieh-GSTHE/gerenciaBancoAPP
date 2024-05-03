package com.mycompany.gerenciabanco;

  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;

/**
 *
 * @author diehg
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        String nomeCliente = "Antônio";
        String sobreNomeCliente = "Sousa";
        String tipoConta = "Corrente";
        int cpf = 12345678;
        double cartaoCredito = 1400.00;
        double saldoConta = 2000.99;
        int opcao = 0;
        
        System.out.println(nomeCliente + ", seja bem-vindo ao YouBanco :)");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("\nNome do Cliente: " + nomeCliente + sobreNomeCliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldoConta);
        System.out.println("\n**************************************\n");
        System.out.println(nomeCliente + ", em que posso te ajudar?");

        String menu = """
                
                1 - Consultar Saldo
                2 - Transferência
                3 - Receber via QR Code
                4 - Cartão de Crédito
                5 - Sair
               
                Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Quanto quer transferir?");
               double valor = leitura.nextDouble();
               if (valor > saldoConta) {
                   System.out.println(":( Saldo insuficiente");
               } else {
                   saldoConta -= valor;
                   System.out.println("Novo saldo: " + saldoConta);
               }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldoConta += valor;
                System.out.println("Novo valor: " + saldoConta);
            } else if (opcao == 4) {
                System.out.println("Seu saldo do cartão é: " + cartaoCredito);
            } else if (opcao > 5) {
                System.out.println(":/ Opção inválida");
            } else if (opcao == 5) {
                System.out.println("Que bom ter te ajudado! Até breve ;)");

            }
        }

            }
    }
