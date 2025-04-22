package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Criamos a Coleção ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		//Adicionando valores ao ArrayList
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(2.0);
		
		double input=0;
		
		/*
		System.out.println("Digite um número real: ");
		double input = leia.nextDouble();
		
		numeros.add(input);*/
		
		//Listadno os valores da Coleção ArrayList
		for(var numero :numeros) {
			System.out.println(numero);
		}
		
		System.out.println("Indice do número 9.0: " + numeros.indexOf(9.0));

		System.out.println("O numero 9.0 existe na coleção? " + numeros.contains(9.0));
		
		System.out.println("Qual valor está armazenado no indice 2? " + numeros.get(2));
		
		//Alterar valor de um elemento
		//numeros.set(2,  10.0);
		
		//Exibe os dados atualizados, através do método forEach
		System.out.println("Exibe os dados após a atualização");
		numeros.forEach(System.out::println);
		
		
		//Excluir um elemento da lista
		numeros.remove(2);
		
		//Excluir um elemento da lista
		numeros.remove(2.0);
		
		//Exibe os dados atualizados, através do método forEach		
		System.out.println("Exibe os dados após a exclusão");
		numeros.forEach(System.out::println);

		System.out.println("Qual é o tamanho da Coleção? " + numeros.size());
		
		//Limpar a Coleção
		//numeros.clear();
		
		System.out.println("Acoleção está vazia? " + numeros.isEmpty());
		
		//Ordenar coleção em ordem crescente
		numeros.sort(null);
		
		// Exibe os dados atualizados, através do método forEach		
		System.out.println("Exibir os dados ordenados em ordem crescente ");
		numeros.forEach(System.out::println);
		
		//Ordenar coleção em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
				
		// Exibe os dados atualizados, através do método forEach
		System.out.println("Exibir os dados ordenados em ordem crescente ");
		numeros.forEach(System.out::println);

		leia.close();	
	}

}
