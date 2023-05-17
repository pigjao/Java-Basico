package loiane.java.aula17.labs;


public class Exer029 {
    public static void main(String[] args) {


        System.out.println("Panificadora Pão de Ontem - Tabela de preços");
        System.out.println(" Preço do pão: R$ 0.18");

        for (int i = 1; i <= 50 ; i++){
            System.out.println(i + " - R$ " + (i * 0.18));
        }
    }
}
