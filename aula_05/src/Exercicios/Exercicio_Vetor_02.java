package Exercicios;

import java.util.Scanner;

public class Exercicio_Vetor_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
        int vetor[] = new int[10];
        int soma = 0;
        double media;

        // Entrada de dados: lendo 10 números e armazenando no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = leia.nextInt();
        }

        System.out.println("\nElementos nos índices ímpares:");
        for (int i = 1; i < vetor.length; i += 2) {  // Índices ímpares: 1, 3, 5, 7, 9
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nElementos pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }

        // Calculando a soma
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        // Calculando a média
        media = (double) soma / vetor.length;

        System.out.println("\n\nSoma: " + soma);
        System.out.printf("Média: %.2f\n", media);

        leia.close();
    }
}