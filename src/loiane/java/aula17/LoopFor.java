package loiane.java.aula17;

public class LoopFor {
    public static void main(String[] args) {

        //          for(inicialização; condição; atualização){
        //              bloco de código
        //          }

        for(int i = 0; i <= 5; i++){
            System.out.println("Valor de i: " + i);
        }

        for(int i = 5; i > 0; i--){
            System.out.println("Valor de i: " + i);
        }




        // for com dois contadores
        for(int i = 0, j=10; i <= j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }




        //partes ausentes
        int i = 0;

        for(;i < 10 ;){
            System.out.println("Valor de i: " + i);
            i += 3;
        }

        //variavel recebendo valor dentro do for
        int soma = 0;
        for (int count = 1; count < 10;soma += count++){
            System.out.println("Soma: " + soma);
        }
    }
}
