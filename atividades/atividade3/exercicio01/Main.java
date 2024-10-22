package atividade3.exercicio01;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        NotaFiscal[] notas = new NotaFiscal[3];

        for (int i = 0; i < notas.length; i++) {
            
            System.out.println("Informe os dados da nota fiscal: " + (i+1) + ":");

            System.out.println("Número de peças");
            String numero = scanner.nextLine();

            System.out.println("Descrição da peça:");
            String descricao = scanner.nextLine();

            System.out.println("Quantidade de peças:");
            int quantidade = scanner.nextInt();

            System.out.println("Preço da peça:");
            double preco = scanner.nextDouble();

            notas[i] = new NotaFiscal(numero, descricao, quantidade, preco);
        }

        double total = NotaFiscal.getTotalVetor(notas);
        System.out.println("Total de todas as notas fiscais: " + total);

        scanner.close();
    }
}
