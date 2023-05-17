package loiane.java.aula17.labs;

import java.util.Scanner;

/*
Faça um programa que calcule o valor total investido por um colecionador
em sua coleção de CDS e o valor médio gasto em cada um deles, o usuário
deverá informar a quantidade de CDS e o valor gasto em cada um.

 */
public class Exer027 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos CDS você tem?");
        int quantidadeCD = leitor.nextInt();

        int totalCD = 0;

        for (int i = 1; i <= quantidadeCD ; i++){
            System.out.println("Qual o valor gasto no CD " + i);
            int valorCD = leitor.nextInt();

            totalCD += valorCD;
        }

        int mediaCD = totalCD / quantidadeCD;

        System.out.println("O colecionador tem " + quantidadeCD + " CD's");
        System.out.println("A média de investimento em cada CD foi: " + mediaCD);


    }
}
