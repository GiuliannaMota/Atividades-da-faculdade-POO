package atividade01;
import java.util.Scanner;

public class Conta {

    //atributos
    private double saldo;
    private int numero;



    //método contrutor
    public Conta(int numero, double saldo) {
        this.numero = numero;
        
        if(saldo < 0) {
            saldo = 0;
            System.out.println("Saldo da conta negativo, será iniciado com 0");
        } else {
            this.saldo = saldo;
        }
        
    }

    //método para escolher qual operação executar
    public void painel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione a operação que deseja efetuar: \n1 - Crédito \n2 - Débito \n3 - Sair");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o valor para crédito: ");
                double valorCredito = scanner.nextDouble();
                credito(valorCredito);
                break;

            case 2:
                System.out.print("Informe o valor para débito: ");
                double valorDebito = scanner.nextDouble();
                credito(valorDebito);
                break; 
        
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }

    //método Crédito
    public void credito(double valor) {
        saldo += valor;
        System.out.println("Crédito efetuado. Saldo atual: R$ " + saldo);
    }

    //método para subtrair valor do saldo
    public void debito(double valor) {
        if(valor > saldo) {
            System.out.println("ERRO! Saldo insuficiente.");
        } else {
            saldo = saldo - valor;
            System.out.println("Débito efetuado. Saldo atual: R$ " + saldo);
        }
    }

    //método para retornar saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método get
    public double getSaldo() {
        return saldo;
    }

    //set do número da conta
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //get do número da conta
    public int getNumero() {
        return numero;
    }
}