package loiane.java.aula17.labs;
//Não fiz o commit nas últimas alterações e perdi as atividades
public class Exer04 {
    public static void main(String[] args) {
        int populacaoBrasil = 80000;
        int populacaoArgentina = 200000;
        int ano = 0;

        while (populacaoBrasil < populacaoArgentina){

            populacaoBrasil += (populacaoBrasil / 100) * 3;
            populacaoArgentina += (populacaoArgentina / 100) * 1.5;
            ano++;
        }
        System.out.println("População do Brasil: " + populacaoBrasil);
        System.out.println("População do EUA: " + populacaoArgentina);
        System.out.println("Será necessário " + ano + " anos para que a população do Brasil seja maior que a população dos EUA");

    }
}
