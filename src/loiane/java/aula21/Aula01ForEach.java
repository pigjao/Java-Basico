package loiane.java.aula21;

public class Aula01ForEach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++){
            notas[i] = (int)Math.round(Math.random() * 10);
        }

        for (int nota : notas){
            System.out.println(nota);
        }
    }
}
