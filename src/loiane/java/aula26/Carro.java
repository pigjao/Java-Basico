package loiane.java.aula26;

    public class Carro {
        String marca;
        String modelo;
        int numeroPassageiros;
        double capacidadeTanque;
        double consumedoMedio;
        int ano;


        // Metodo com retorno utilizamos o tipo de dado antes de declara-lo
        double obterAutonomia(){
            System.out.println("obtendoAutonomia");
            return consumedoMedio * capacidadeTanque;
        }

        //Aula 27
        // Metodo com parâmetro (utilizado quando a informação não está disponível na classe)
        double calcularCombustivel(double km){
            double qtdCombustivel = km/consumedoMedio;

            return qtdCombustivel;

        }
}
