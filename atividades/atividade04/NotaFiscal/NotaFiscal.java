/*Crie uma classe chamada NotaFiscal que represente uma nota fiscal em uma loja de peças. Uma nota fiscal deve incluir quatro dados como
atributos: a. Número da peça (string); b. Descrição da peça (string); c. Quantidade comprada (inteiro); d. Preço (número real).
A classe deve incluir getters e setters para cada um dos atributos. Ainda, deve haverum método getTotalNota que calcule e retorne o total de um vetor de objetos.
Faça tratamento de erro: lance exceções e trate possíveis entradas incorretas*/


package atividade04.NotaFiscal;

public class NotaFiscal {
    
    //Declarando atributos
    private String number;
    private String descrition;
    private int quantity;
    private double price;

    //Construtor
    public NotaFiscal(String number, String descrition, int quantity, double price) {
        this.setNumber(number);
        this.setDescrition(descrition);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    //Get e Set number
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        if (number == null || number.isEmpty()) {
            throw new IllegalArgumentException("Número não pode ser vazio ou nulo!");
        } else{
            this.number = number;
        }
    }

    //Get e Set descrition
    public String getDescrition() {
        return descrition;
    }
    public void setDescrition(String descrition) {
        if (descrition == null || descrition.isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser vazio ou nulo!");
        } else{
            this.descrition = descrition;
        }
    }

    //Get e Set quantity
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa!");
        } else{
            this.quantity = quantity;
        }
    }

    //Get e Set price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo!");
        } else {
            this.price = price;
        }
        
    }

    //Método que calcula total da nota
    public double getTotalNota() {
        return quantity * price;
    }

    //Método para calcular total de um vetor de notas fiscais
    public static double getTotalVetor(NotaFiscal[] notas) {
        double total = 0.0;

        for (int i = 0;  i<notas.length; i++) {
            total = total + notas[i].getTotalNota();
        }
        return total;
    }
}
