package teste;

import java.util.Arrays;
import java.util.Scanner;

public class teste_java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		
		int vet [] = {3,7,6,1,9,4,2};
		
		// vai percorrer por todos os valores do vetor e mostrar na saida de dados
		for(int v: vet) {
				System.out.print(v + " ");
		}
		
		//Fazendo uma busca em um Vetor, vai pesquisar o valor 1
		int p = Arrays.binarySearch(vet, 1);
		
		//vai mostrar em qual possição está o valor 1
		System.out.println("\nEncontrei o valor na posição " + p);
		
		//vai mostar a posição e o valor do vetor
		System.out.println("O numero encontrado é 1 na posição " + p + " do Vetor");
		
		
	}

}
