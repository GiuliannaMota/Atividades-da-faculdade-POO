package atividade02;

public class Carro extends Veiculo{
    
    protected int quantPortas;

    //Construtor inicializda com super()
    public Carro(String marca, String modelo, int quantPortas) {
        super(marca, modelo);
        this.quantPortas = quantPortas;
    }

    //Override do metodo acelerar
    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando\n");
    }

    //Método para imprimir as caracteristicas
    @Override
    public void caracteristicas() {
        super.caracteristicas();
        System.out.println("Número de portas: " + quantPortas);
    }
}
