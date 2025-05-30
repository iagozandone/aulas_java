package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//Cria a estrutura de dados Fila
		Queue<String> fila = new LinkedList<String>();
		
		//Adicionamos elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabrício");
		fila.add("Victor");
		
		System.out.println(fila);
		
		//Remove o primeiro da fila
		fila.remove();
		
		System.out.println(fila);
		
		//Adicionando o nome ao fim da fila 
		fila.add("Thiago");
		fila.add("Iago");

		System.out.println(fila);
		
		//Mostra o primeiro da fila (primeiro que entra é o primeiro que sai)
		System.out.println(fila.peek());
		
		//Mostra e remove o primeiro da fila  (primeiro que entra é o primeiro que sai)
		System.out.println(fila.poll());

		System.out.println(fila);
		
		System.out.println("A Maria está na fila? " + fila.contains("Maria"));
		System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));
		
		System.out.println("Qual é o tamanho da fila? " + fila.size());
		
		int contador = 0;
		for(var pessoa : fila) {
			contador ++;
			if (pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("\nA Maria está em %dº lugar na fila. ", contador);
			}
			
		}
		
	}
	
}
