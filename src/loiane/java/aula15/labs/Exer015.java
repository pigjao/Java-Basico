package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer015 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite três lados de um triângulo:");
        int ladoA = leitor.nextInt();
        int ladoB = leitor.nextInt();
        int ladoC = leitor.nextInt();

        if ((ladoA + ladoB > ladoC) || ((ladoB + ladoC > ladoA))){
            System.out.println("É um triângulo!");


        if(ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Equilátero!: ");

        } else if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC){
            System.out.println("Escaleno");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("É um Isóceles!");
            }

}}}
