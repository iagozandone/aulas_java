package aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Maçã");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("maçã");

		System.out.println(frutas);
		
		for(var fruta : frutas) {
			System.out.println(fruta.hashCode());
			
		}
		
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		//Excluir elemento da coleção
		frutas.remove("Morango");
		System.out.println("Morango existe na coleção? " + frutas.contains("Morango"));
		
		//Criar um Iterator
		Iterator<String> iFrutas = frutas.iterator();
		
		// Listei os dados após a exclusão de um elemento (Morando)
		while (iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}
		//Criamos a Coleção ArrayList
		ArrayList<String> frutasList = new ArrayList <String>();
		
		//Adicionamos todos os elementos da Coleção Set (frutas)
		//na coleção ArrayList (frutasList)
		frutasList.addAll(frutas);
		
		//Ordenamos fritasList em ordem Crescente
		frutasList.sort(null);
		
		//Exibimos frutaList em ordem crescente.
		System.out.println("Exibir os dados do Array List ");
		frutasList.forEach(System.out::println);
	}
}
