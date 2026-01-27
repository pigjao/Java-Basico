package loiane.java.aula30;

public class CarroAulaThis {
    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumedoMedio;
    int ano;

    public CarroAulaThis(){}

    public CarroAulaThis(int ano,
                         double consumedoMedio,
                         double capacidadeTanque,
                         int numeroPassageiros,
                         String modelo, String marca) {
        this.ano = ano;
        this.consumedoMedio = consumedoMedio;
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.modelo = modelo;
        this.marca = marca;
    }

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
