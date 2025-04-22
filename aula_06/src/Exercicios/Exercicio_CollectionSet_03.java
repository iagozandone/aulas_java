package Exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_CollectionSet_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
        // Usando List para aceitar números repetidos
		List<Integer> numeros = new ArrayList<Integer>();

		while(numeros.size() < 10) {
			System.out.print("Digite o " + "º valor inteiro: ");
			int valor = leia.nextInt();
			
            // Adiciona o valor na lista, mesmo que seja repetido
			numeros.add(valor);
		}
	}

}
