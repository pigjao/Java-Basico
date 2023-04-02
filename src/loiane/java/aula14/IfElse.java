package loiane.java.aula14;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");

        int idade = leitor.nextInt();;


        //if
        if(idade >= 18){
            System.out.println("É maior de idade");
        }
        else
        {
            System.out.println("Menor de idade!");
        }



        //Exemplo 2 if - else aninhado

        System.out.println("Entre com um valor: ");
        double valor = leitor.nextDouble();

        if(valor <= 10){
            System.out.println("Barato");
        }
        else if (valor > 10 && valor < 15){
            System.out.println("Quem não chora, não mama!");
        } else if (valor >= 15 && valor <= 17) {
            System.out.println("Pesquise mais!");
        } else if (valor > 17) {
            System.out.println("FUJA!");
        }
    }}      
