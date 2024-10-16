package atividade02;

public class Moto extends Veiculo{

    protected boolean carenagem;

    public Moto(String marca, String modelo, boolean carenagem) {
        super(marca, modelo);
        this.carenagem = carenagem;
    }

    //Override do metodo acelerar
    @Override
    public void acelerar(){
        System.out.println("A moto está acelerando\n");
    }

    //Método para imprimir as caracteristicas
    @Override
    public void caracteristicas() {
        super.caracteristicas();
        System.out.println("Número de portas: " + carenagem);
    }
}
