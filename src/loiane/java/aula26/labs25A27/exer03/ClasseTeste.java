package loiane.java.aula26.labs25A27.exer03;

import java.util.Scanner;

public class ClasseTeste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Insira o nome do aluno");
        aluno.nome = leitor.next();


        aluno.curso = leitor.next();
        System.out.println("Insira o curso do aluno");


        aluno.matricula = leitor.next();
        System.out.println("Insira a matrícula do aluno");

        aluno.disciplinasSemestrais = new String[3];
        aluno.notas = new double[3];

        for (int i = 0; i < aluno.disciplinasSemestrais.length; i++){
            System.out.println("Insira o nome da disciplica " + (1 + i));
            aluno.disciplinasSemestrais[i] = leitor.next();

            System.out.println("Insira a nota atual da discplica: " + aluno.disciplinasSemestrais[i]);
            aluno.notas[i] = leitor.nextDouble();
        }

        System.out.println("Insira a disciplica que deseja verificar");
        aluno.verificarAprovacao(leitor.nextInt());








    }
}

