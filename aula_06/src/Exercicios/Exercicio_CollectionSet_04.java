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
	        numeros.add(0);
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	        numeros.add(6);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(9);


	        // Exibindo os números presentes no Set
	        System.out.println("Lista de números no Set:");
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }

	        // Solicitando ao usuário que digite um número
	        System.out.print("\nDigite o número que você deseja encontrar: ");
	        int numeroProcurado = leia.nextInt();

	        // Verificando se o número digitado está no Set
	        if (numeros.contains(numeroProcurado)) {
	            System.out.println("\nO número " + numeroProcurado + " foi encontrado!");
	        } else {
	            System.out.println("\nO número " + numeroProcurado + " não foi encontrado!");
	        }

	        leia.close();
	    }
	}