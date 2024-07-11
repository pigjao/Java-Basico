package loiane.java.aula26.labs25A27.exer04;

import java.util.Scanner;

public class jogoDaVelha {

    int jogada = 1;
    char[][] tabuleiro;
    char linha;
    char coluna;


    void jogar(){
        System.out.println("Jogador Um, Escolha sua linha e coluna (1-3)");
        Scanner leitor = new Scanner(System.in);
        linha = (char) leitor.nextInt();
        coluna = (char) leitor.nextInt();
        linha--;
        coluna--;

    }

    boolean validarJogadaJogadorUm() {
        if (linha > 2 || coluna > 2) {
            System.out.println("Valor incorreto, insira novamente valores de 1 a 3!");
            return false;
        } else if (tabuleiro[linha][coluna] == 'X' ||
                tabuleiro[linha][coluna] == 'O') { // validando que o campo está livre
            System.out.println("Erro: este campo já foi" +
                    " utilizado, tente novamente!");
            return false;
        } else {
            tabuleiro[linha][coluna] = 'X';
            return true;
        }

    }    boolean validarJogadaJogadorDois() {
        if (linha > 2 || coluna > 2) {
            System.out.println("Valor incorreto, insira novamente valores de 1 a 3!");
            return false;
        } else if (tabuleiro[linha][coluna] == 'X' ||
                tabuleiro[linha][coluna] == 'O') { // validando que o campo está livre
            System.out.println("Erro: este campo já foi" +
                    " utilizado, tente novamente!");
            return false;
        } else {
            tabuleiro[linha][coluna] = 'O';
            return true;
        }

    }

    void imprimirTabuleiro() {
        for (char[] chars : tabuleiro) {
            for (char aChar : chars) {

                System.out.print(aChar + "  ");

            }
            System.out.println();
        }
    }

    boolean validarVitoria() {
        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // LINHA 0
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // Linha 1
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // Linha 2
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // Coluna 0
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // Coluna 1
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // Coluna 2
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || // Coluna \
                (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) {    // Coluna \
            System.out.println("Parabéns, Jogador 1! Você ganhou");
            return true;
        } else if // Validar se o jogador dois ganhou
        ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // LINHA 0
                        (tabuleiro[1][0] == '0' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // Linha 1
                        (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // Linha 2
                        (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // Coluna 0
                        (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // Coluna 1
                        (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // Coluna 2
                        (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || // Coluna \
                        (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')){    // Coluna \
            System.out.println("Parabéns, Jogador 2! Você ganhou");
            return true;
        } else if(jogada > 9){
            System.out.println("Ninguém ganhou essa partida!");
            return true;

        }

        return false;
    }

}

