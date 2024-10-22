package atividade04.NotaFiscal;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //Iniciando Scanner
        NotaFiscal[] notas = new NotaFiscal[3];

        for (int i = 0; i < notas.length; i++) {
            
            try {
                System.out.println("Informe os dados da nota fiscal " + (i+1) + ":");

                System.out.println("Número de peças: ");
                String number = scanner.nextLine();

                System.out.println("Descrição da peças: ");
                String descrition = scanner.nextLine();

                System.out.println("Quantidade de peças: ");
                int quantity = scanner.nextInt();

                System.out.println("Preço da peças: ");
                double price = scanner.nextDouble();

                scanner.nextLine(); // Consumir o \n

                notas[i] = new NotaFiscal(number, descrition, quantity, price);

            } catch(InputMismatchException e) {
                System.out.println("ERRO: Formato inválido!");
                scanner.nextLine(); //Limpar o buffer
                i--; //Refaz o loop
            } catch(IllegalArgumentException e) {
                System.out.println("ERRO: " + e.getMessage());
                i--; //Refaz o loop
            }
        }

        double total = NotaFiscal.getTotalVetor(notas);
        System.out.println("Total de todas as notas fiscais: " + total);
        
        scanner.close();  // Fechando o Scanner
    }
}
