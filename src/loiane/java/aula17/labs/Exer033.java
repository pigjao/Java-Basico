package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer033 {

    /*
    O cardápio de uma lanchonete é o seguinte:

    ESPECIFICAÇÃO         CÓDIGO         PREÇO
    CACHORRO QUENTE       100            R$1,20
    BAURU SIMPLES         101            R$1,30
    BAURU COM OVO         102            R$1,50
    HAMBÚRGUER            103            R$1,20
    CHEESEBURGUER         104            R$1,30
    REFRIGERANTE          105            R$1,00


    Faça um programa que leia o código dos itens pedidos e quantidades desejadas.
    Calcule e mostre o valor a ser pago por item e o total geral do pedido.
    Considere que o cliente deve informar quando o pedido for encerrado
     */


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao SOFTPIG, seu sistema de compras ágil");
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Aqui está o nosso cárdapio");
        System.out.println("------------------------------------------------------");
        System.out.println("    ESPECIFICAÇÃO         CÓDIGO         PREÇO\n" +
                "    CACHORRO QUENTE       100            R$1,20  \n" +
                "    BAURU SIMPLES         101            R$1,30  \n" +
                "    BAURU COM OVO         102            R$1,50  \n" +
                "    HAMBÚRGUER            103            R$1,20  \n" +
                "    CHEESEBURGUER         104            R$1,30  \n" +
                "    REFRIGERANTE          105            R$1,00");


        double parcial = 0;
        double total = 0;
        boolean novoPedido;
        String output = "";

        do {

            System.out.println("Digite o código do seu pedido e logo em seguida digite a quantidade");
            int codigoPedido = leitor.nextInt();
            int quantidade = leitor.nextInt();

            switch (codigoPedido) {
                case 100:
                case 103:
                    parcial = quantidade * 1.2;
                    break;
                case 101:
                case 104:
                    parcial = quantidade * 1.3;
                    break;
                case 102:
                    parcial = quantidade * 1.5;
                    break;
                case 105:
                    parcial = quantidade;
                    break;
            }

            total += parcial;

            System.out.println("Valor parcial do pedido: R$" + total);
            System.out.println("Deseja pedir algo mais?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            int continuar = leitor.nextInt();
            novoPedido = continuar != 2;


        } while (novoPedido);

        System.out.println("Valor total do pedido: R$" + total);
        System.out.println("----------------------------------------------- ");
        System.out.println("Muito obrigado! SOFTPIG agradece a prefêrencia!");
    }
}
