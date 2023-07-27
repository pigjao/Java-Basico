package loiane.java.aula19.labs;

import java.util.Scanner;

public class Exer019 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];

        for (int i = 0; i < nota1.length; i++){
            System.out.println("Digite as duas notas do aluno " + (i+1) + ":");
            nota1[i] = leitor.nextDouble();
            nota2[i] = leitor.nextDouble();
        }

        double[] resultado = new double[10];
        for (int j = 0; j < resultado.length; j++){
            resultado[j] = (nota1[j] + nota2[j]) / 2;
            if (resultado[j] <  7){
                System.out.println("Aluno " + (j+1) + ": ficou com média: " + resultado[j] + ". Reprovado!");
            } else {
                System.out.println("Aluno " + (j+1) + ": ficou com média: " + resultado[j] + ". Aprovado!");
            }
        }
    }

}
