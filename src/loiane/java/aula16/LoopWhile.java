package loiane.java.aula16;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1;  //count ou cont
        int max = 10;


        System.out.println("Contando até " + max);

        // enquanto a expressão for verdadeira irá executar o bloco
        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++; // i = i + 1; ou i += 1;
        }

        System.out.println(i); //valor 11

        //faça enquanto (primeiro exectua depois avalia a expressão)
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);
    }
}
