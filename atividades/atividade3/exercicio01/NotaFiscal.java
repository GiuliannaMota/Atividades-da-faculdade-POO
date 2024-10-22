/*Crie uma classe chamada NotaFiscal que represente uma nota fiscal em uma loja de peças. Uma nota fiscal deve incluir quatro dados como
atributos: a. Número da peça (string); b. Descrição da peça (string); c. Quantidade comprada (inteiro); d. Preço (número real).
A classe deve incluir getters e setters para cada um dos atributos. Ainda, deve haverum método getTotalNota que calcule e retorne o total de um vetor de objetos.*/

package atividade3.exercicio01;

public class NotaFiscal {
    
    //Declarando Atributos
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    //Construtor
    public NotaFiscal(String numero, String descricao, int quantidade, double preco) {
        this.setNumero(numero);
        this.setDescricao(descricao);
        this.setQuantidade(quantidade);
        this.setPreco(preco);
    }

    //Get e Set numero
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Get e Set descrição
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Get e Set quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Get e Set preço
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Método Total Nota
    public double getTotalNota() {
        return quantidade*preco;
    }

    //Método Total de todas Notas
    public static double getTotalVetor(NotaFiscal[] notas) {
        
        double total = 0.0;

        for(int i =0; i < notas.length; i++) {
            total += notas[i].getTotalNota();
        }

        return total;
    }
}
