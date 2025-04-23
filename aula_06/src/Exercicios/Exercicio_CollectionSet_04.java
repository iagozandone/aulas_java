package Exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_CollectionSet_04 {

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

	        // Criando e inicializando o Set com 10 valores inteiros
	        Set<Integer> numeros = new HashSet<>();
	      
	        // Exibindo os números presentes no Set
	        System.out.println("Lista de números no Set:");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }

	        // Solicitando ao usuário que digite um número
	        System.out.print("\nDigite o número que você deseja encontrar: ");
	        int num01 = leia.nextInt();

	        // Verificando se o número digitado está no Set
	        if (numeros.contains(num01)) {
	            System.out.println("\nO número " + num01 + " foi encontrado!");
	        } else {
	            System.out.println("\nO número " + num01 + " não foi encontrado!");
	        }

	        leia.close();
	    }
	}