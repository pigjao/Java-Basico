package loiane.java.aula19;

public class Arrays {
    /*Lista ordenada de dados
    - Estrutura de dados mais simples existente
     */


    public static void main(String[] args) {

        //boa prática declarar após o tipo
        double[] temperaturas = new double[365];

        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 34.4;
        temperaturas[3] = 29.1;
        temperaturas[4] = 30;


        System.out.println("Temperatura dia x: " + temperaturas[2]);

        System.out.println("Tamanho do Array: " + temperaturas.length);


        for (int i = 0; i< temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia: " + (i+1) + " é: " + temperaturas[i]);
        }


        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }

}
