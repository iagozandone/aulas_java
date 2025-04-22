package Exercicios;

import java.util.Scanner;

public class Exercicio_Matriz_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
        // Criando a matriz de 10 alunos e 4 notas
        double[][] notas = new double[10][4];
        
        // Criando o vetor de médias para armazenar a média de cada aluno
        double[] medias = new double[10];
        
        // Laço para ler as notas dos 10 alunos
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ": ");
            
            // Laço para ler as notas de cada aluno 
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do " + (j + 1) + "º bimestre: ");
                notas[i][j] = leia.nextDouble();  // Lê a nota e armazena na matriz
            }
        }
        
        // Laço para calcular a média de cada aluno e armazenar no vetor medias
        for (int i = 0; i < 10; i++) {
            double soma = 0.0;
            // Calculando a soma das 4 notas do aluno
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            // Calculando a média
            medias[i] = soma / 4;
        }
        
        // Exibindo as médias dos alunos
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %.1f ", medias[i]);
        }
        
        leia.close();
    }
}