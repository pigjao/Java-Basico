package loiane.java.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        boolean resultado = (x == 1 || y == 3);
        System.out.println("x é 1 || y é 2 " + resultado);

        boolean resultado2 = (x != 1 && y == 2);
        System.out.println("x é diferente de 1 && y é 2 " + resultado2);


    }
}
