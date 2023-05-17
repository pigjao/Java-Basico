package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer030 {
    public static void main(String [] args){
        /*
        O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
         */
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor dos produtos. Para finalizar digite 0");

        int i = 0;
        double valorProduto;
        double somaProdutos = 0;

        do {
            valorProduto = leitor.nextDouble();
            somaProdutos += valorProduto;
            i++;
            System.out.println("Produto + " + i + ":" + " R$" + valorProduto);
        } while (valorProduto != 0);

        System.out.println("Total: R$" + String.format("%.2f", somaProdutos));

        System.out.println("Forma de pagamento em reais");
        double pagamento = leitor.nextDouble();

        double troco = pagamento - somaProdutos;



        System.out.println("Troco: R$" + String.format("%.2f", troco));

    }
}
