package aula_02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Definição das variáveis 
		System.out.println("Digite o primeiro Número inteiro:");
		int numero_01 = leia.nextInt();
		
		System.out.println("Digite o segundo Número inteiro:");
		int numero_02 = leia.nextInt();
		
		char opcao = 'v';
		boolean menorIdade = true;
		
		System.out.println("Digite seu nome: ");
		String nome = leia.next();
				
		//Definição da contante PI
		final double PI = 3.1415;
		
		//Atribuição de valor (subistitui o valor do numero 2
		//20numero_02 = 75;
		
		System.out.printf("Variavel numero 1 %d variavel numero 2 %d\n", numero_01, numero_02);
		System.out.println("Variavel numero 2 é igual a: " + numero_02);	
		System.out.printf("Constante PI é igual a: %.2f\n", PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
	}

}
