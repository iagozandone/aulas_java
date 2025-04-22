package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		int vetor [] = {2,5,1,3,4,9,7,8,10,6};
		
		System.out.print("Digite o númeor que voce deseja encontrar: ");
		int num01 = leia.nextInt();
		 int posicao = 0;
		
		System.out.println("Aqui está todos os valores salvos no vetor: " );
		// vai percorrer por todos os valores do vetor e mostrar na saida de dados
		for(int v: vetor) {
			System.out.print( v + " ");
		}
		//Verifica se os numeros no vetor é igual o valor de entrada, se for ele armazena na variavel posicao.
		for (int i = 0; i<vetor.length; i++) {
			if (vetor[i] ==num01) {
				posicao = i;
				break;
			}
		}
		//se posicao for diferente de 0 então significa que ele achou pois ele é declarado como 0
		if (posicao != -0) {
			System.out.println("\nO número " + num01 + " está localizado na posição " + posicao + "!");
		}else {
			System.out.println("\nO número " + num01 + " não foi encontrado!");
		}
				
		leia.close();

		}
		
	}
