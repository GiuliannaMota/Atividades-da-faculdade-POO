package atividade02;

public class Main {
    public static void main(String[] args) {

        //Array do tipo Veiculo
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro("Fiat", "Argo", 4);
        veiculos[1] = new Moto("Honda", "XRE 190", true);

        veiculos[0].acelerar();
        veiculos[1].acelerar();

        for(int i=0; i<veiculos.length; i++) {
            veiculos[i].caracteristicas();
            veiculos[i].acelerar();
            System.out.println();
        }
    }
}
