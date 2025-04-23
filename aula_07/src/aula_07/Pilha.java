package aula_07;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não Violenta");
		pilha.add("IT: A Coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("Diario de um Banana");
		pilha.add("Senhor dos Anéis");
		pilha.add("O Codigo da Vinci");
		
		//O usuario inclui mais um livro na lista
		System.out.println("Digite o titulo de um livro: ");
		pilha.push(leia.nextLine());
		
		System.out.println(pilha);
		
		// Retira um elemento da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		//Adiciona um Elemento na pilha
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		//Exibe o elemento que está no topo da pila
		System.out.println(pilha.peek());
		
		//Verifica se um elemento existe na pilha
		System.out.println("O Livro Diário de um Banana, existe na pilha? " + pilha.contains("Diario de um Banana"));

		
		leia.close();
	}

}
