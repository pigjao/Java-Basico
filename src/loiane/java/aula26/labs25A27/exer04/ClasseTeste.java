package loiane.java.aula26.labs25A27.exer04;

public class ClasseTeste {
    public static void main(String[] args) {

        jogoDaVelha jogo = new jogoDaVelha();
        jogo.tabuleiro = new char[3][3];


        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        boolean jogadaValida = false;

        while(!ganhou){
            if (jogada % 2 == 1) {// jogador 1
                while(!jogadaValida) {
                    jogo.jogar();

                    if (jogo.validarJogadaJogadorUm()){
                        jogadaValida = true;
                    }
                }

            } else if (jogada % 2 == 0) {// jogador 2
                while(!jogadaValida) {
                    jogo.jogar();

                    if (jogo.validarJogadaJogadorDois()){
                        jogadaValida = true;
                    }
                }
            }

            jogada++;

            // Imprimir o tabuleiro após uma jogada
            jogo.imprimirTabuleiro();
            jogadaValida = false;

            // Validar se o jogador um ganhou

            if (jogo.validarVitoria()){
                ganhou = true;
            }

        }
    }
}
