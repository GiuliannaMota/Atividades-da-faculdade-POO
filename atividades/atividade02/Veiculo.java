package atividade02;

public class Veiculo {
    
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Veículo está acelerando\n");
    }

    public void caracteristicas() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
