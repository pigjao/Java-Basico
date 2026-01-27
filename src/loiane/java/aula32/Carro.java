package loiane.java.aula32;

//Encapsulamento getters e setters

public class Carro {
    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double capacidadeTanque;
    private double consumedoMedio;
    private int ano;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getNumeroPassageiros(){
        return this.numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros){
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double getConsumedoMedio() {
        return consumedoMedio;
    }

    public int getAno() {
        return ano;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void setConsumedoMedio(double consumedoMedio) {
        this.consumedoMedio = consumedoMedio;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
