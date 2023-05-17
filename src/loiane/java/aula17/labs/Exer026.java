package loiane.java.aula17.labs;

/*FAÇA UM PROGRAMA QUE CALCULE O NÚMERO MÉDIO DE ALUNOS POR TURMA
PEÇA A QUANTIDADE DE TURMAS E A QUANTIDADE DE ALUNOS PARA CADA TURMA.
AS TURMAS NÃO PODEM TER MAIS DE 40 ALUNOS */


import java.util.Scanner;

public class Exer026 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantas turmas existem?");
        int turmas = leitor.nextInt();
        int somaTurmas = 0;

        for(int i = 1; i <= turmas; i++){
            System.out.println("Digite a quantidade de alunos da turma: " + i);
            int quantidadePorTurma = leitor.nextInt();
            somaTurmas += quantidadePorTurma;

        }

        int mediaTurmas = somaTurmas / turmas;
        System.out.println("A média de alunos por turma é de: " + mediaTurmas);

    }
}
