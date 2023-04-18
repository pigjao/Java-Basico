package loiane.java.aula17.labs;

import java.util.Scanner;

public class Exer023 {
    //Faça um programa que calcule e mostre a média aritmética de N notas

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de notas: ");
         double eneNotas = leitor.nextInt();
         double total = 0;

         for (int i = 1 ; i <= eneNotas; i++){
             System.out.println("Digite a nota: " + i);
             double notas = leitor.nextInt();
             total += notas;
         }
         double media = total / eneNotas;
        System.out.println("A média total foi: " + media);
    }
}
