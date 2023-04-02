package loiane.java.aula13.labs;

import java.util.Scanner;

public class NotaBimestral {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite as suas notas de cada bimestre: ");

        double notaPrimeiroBimestre = leitor.nextDouble();
        double notaSegundoBimestre = leitor.nextDouble();
        double notaTerceiroBimestre = leitor.nextDouble();
        double notaQuartoBimestre = leitor.nextDouble();

        System.out.println("A média anual do aluno foi: " + (notaQuartoBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaPrimeiroBimestre) / 4);


}}
