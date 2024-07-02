package loiane.java.aula20.labs;

/*
Faça um programa para jogar o jogo da velha. O programa deve
permitir que dois jogadores façam uma partida do jogo da velha,
usando o computador para ver o tabuleiro. Cada jogador vai
alternadamente informando a posição onde deseja colocar a sua
peça ('O' ou 'X'). O programa deve impedir jogadas inválidas e
determinar automaticamente quando o jogo terminou e quem foi o
vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
deve atualizar a situação do tabuleiro na tela.
 */

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        char linha;
        char coluna;
        boolean jogadaValida = false;

        while(!ganhou){

                if (jogada % 2 == 1) {// jogador 1

                    while(!jogadaValida) {
                        System.out.println("Jogador Um, Escolha sua linha e coluna (1-3)");
                        sinal = 'X';
                        linha = (char) leitor.nextInt();
                        coluna = (char) leitor.nextInt();

                        if (linha > 2 || coluna > 2) {
                            System.out.println("Valor incorreto, insira novamente valores de 1 a 3!");
                        }
                            else if (jogoDaVelha[linha][coluna] == 'X' ||
                                    jogoDaVelha[linha][coluna] == 'O') { // validando que o campo está livre
                                System.out.println("Erro: este campo já foi" +
                                        " utilizado, tente novamente!");

                            } else {
                                jogoDaVelha[linha][coluna] = sinal;
                                jogadaValida = true;
                            }



                    }


                } else if (jogada % 2 == 0) {// jogador 2

                    while(!jogadaValida) {
                        System.out.println("Jogador Dois, Escolha sua linha e coluna (1-3)");
                        sinal = 'O';
                        linha = (char) leitor.nextInt();
                        coluna = (char) leitor.nextInt();
                        linha--;
                        coluna--;

                        if (linha > 2 || coluna > 2) {
                            System.out.println("Valor incorreto, insira novamente valores de 1 a 3!");
                        }
                            else if(jogoDaVelha[linha][coluna] == 'X' ||
                                jogoDaVelha[linha][coluna] == 'O'){ // validando que o campo está livre
                            System.out.println("Erro: este campo já foi" +
                                    " utilizado, tente novamente!");

                        } else {
                            jogoDaVelha[linha][coluna] = sinal;
                            jogadaValida = true;
                        }

                    }

                }
                jogada++;

                // Imprimir o tabuleiro após uma jogada
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {

                        System.out.print(jogoDaVelha[i][j] + "  ");

                    }
                    System.out.println();
                }
                jogadaValida = false;

                // Validar se o jogador um ganhou
                if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // LINHA 0
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // Linha 1
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || // Linha 2
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // Coluna 0
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // Coluna 1
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // Coluna 2
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || // Coluna \
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {    // Coluna \
                    System.out.println("Parabéns, Jogador 1! Você ganhou");
                    ganhou = true;
                } else if // Validar se o jogador dois ganhou
                   ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || // LINHA 0
                    (jogoDaVelha[1][0] == '0' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || // Linha 1
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || // Linha 2
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || // Coluna 0
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || // Coluna 1
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || // Coluna 2
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || // Coluna \
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')){    // Coluna \
                System.out.println("Parabéns, Jogador 2! Você ganhou");
                ganhou = true;
            } else if(jogada > 9){
                    ganhou = true;
                    System.out.println("Ninguém ganhou essa partida!");
                }

            }
        }
    }

