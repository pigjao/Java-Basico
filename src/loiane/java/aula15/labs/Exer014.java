package loiane.java.aula15.labs;

import java.util.Scanner;

public class Exer014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quais foram as parciais do primeiro e segundo bimestre?");
        double parcialpPrimeiroBimestre = leitor.nextDouble();
        double parcialpSegundoBimestre = leitor.nextDouble();

        double media = (parcialpPrimeiroBimestre + parcialpSegundoBimestre) /2;

        if (media >= 9 && media <= 10){
            System.out.println("A média foi: " + media);
            System.out.println("A");
            System.out.println("Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("A média foi: " + media);
            System.out.println("B");
            System.out.println("Aprovado");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("A média foi: " + media);
            System.out.println("C");
            System.out.println("Aprovado");
        } else if (media >= 4 && media < 6) {
            System.out.println("A média foi: " + media);
            System.out.println("D");
            System.out.println("Reprovado");
        } else if (media > 0 && media < 4) {
            System.out.println("A média foi: " + media);
            System.out.println("E");
            System.out.println("Reprovado");
        }
    }
}
