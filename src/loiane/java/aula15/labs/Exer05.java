package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota parcial!: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota parcial!: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 + nota2)/2;

         if (media == 10.0) {
        System.out.println("Aprovação com distinção!");
        }
        else if (media >= 7){
            System.out.println("Você foi aprovado!");
        } else if (media < 7) {
            System.out.println("Reprovado!");

    }

}}
