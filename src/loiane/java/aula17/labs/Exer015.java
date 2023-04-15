package loiane.java.aula17.labs;

public class Exer015 {
    public static void main(String[] args) {

        int numeroAnterior = 0;
        int numeroAtual = 0;
        int soma = 0;

        for (int i = 1; i <= 20; i++){
            if (i == 20){
                System.out.println(soma);
            } else {
                System.out.print(soma + ", ");
            }

            soma = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = soma;

            if(soma < 1){
                soma++;
                numeroAtual++;
            }

        }
    }
}
