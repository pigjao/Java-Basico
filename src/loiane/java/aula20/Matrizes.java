package loiane.java.aula20;

public class Matrizes {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[2][4];

        //Aluno 1
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 9.5;

        //Aluno 2
        notasAlunos[1][0] = 10;
        notasAlunos[1][1] = 9;
        notasAlunos[1][2] = 4;
        notasAlunos[1][3] = 5;

        //Assim em diante

        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }


        System.out.println("Calculando a média dos alunos");

        double soma;

        for (int i = 0; i < notasAlunos.length; i++) {
            soma = 0;

            for (int j = 0; j < notasAlunos[i].length; j++) {
            soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é " + (soma/4));
        }

        System.out.println();

        //Declarando o valor inicializando a matriz

        double[][] notasAlunos2 = {{10, 9, 8, 7}, {8, 3.5, 9.9, 2}};
        for (int i = 0; i < notasAlunos2.length; i++) {
            for (int j = 0; j < notasAlunos2[i].length; j++) {
                System.out.print(notasAlunos2[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
