package atividade01;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //informações primeira conta
        System.out.print("\nDigite o número da conta: ");
        int numero1 = scanner.nextInt();
        //Instanciando a primeira conta
        Conta conta1 = new Conta(numero1, 1000);
        conta1.painel();

        //informações primeira conta
        System.out.print("\nDigite o número da conta: ");
        int numero2 = scanner.nextInt();
        //Instanciando a segunda conta
        Conta conta2 = new Conta(numero2, 10000);
        conta2.painel();

        scanner.close();
    }
}

