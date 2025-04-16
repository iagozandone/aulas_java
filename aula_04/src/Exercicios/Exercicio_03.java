package Exercicios;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int quantidade = 0, contador = 1, idade = 1,menor21 = 0, idadeEntre = 0, maior50 = 0;
		
		//Vai repetir enquanto a IDADE que for digitada for maior ou igual a 0, se digitar numero negativo ele finaliza o programa. (Observe que idade comça com o valor de 1 para que o programa rode)
		while (idade >= 0) {
		
		//Perguntando a idade
		System.out.printf("Digite uma idade: ");
		idade = leia.nextInt();
		
		//Apos cada quantidade digitada ele vai adicionar 1 na idade, pra saber o total de quantas idades foram adicionadas
			quantidade++;
			
		//se idade for maior que 0 e menor que 21 ele adiciona 1 a variavel cada vez que passar aqui e tiver essas condições.
		if (idade > 0 && idade < 21) {
			menor21++;
			
		//se idade for maior que 0 e menor que 21 ele adiciona 1 a variavel cada vez que passar aqui e tiver essas condições.
		}else if (idade > 20 && idade <= 50) {
			idadeEntre++;

		//se idade for maior que 0 e menor que 21 ele adiciona 1 a variavel cada vez que passar aqui e tiver essas condições.
		}else if (idade > 50) { 
			maior50++;
		}
		//se idade for um numero negativo ele tira -1 da quantidade pra nao contar como pessoa 
		else {
			quantidade--;
		}
	}
		leia.close();
		
		System.out.println("----------------------------------------");
		System.out.println("         Dados De Faixa Etaria          ");
		System.out.println("----------------------------------------");
		System.out.println("                                        ");
		System.out.println("         Total de pessoas: " + quantidade);
		System.out.println("Total de pessoas menores de 21 anos: " + menor21);
		System.out.println("Total de pessoas entre 21 e 50 anos: " + idadeEntre);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
		System.out.println("                                        ");
		System.out.println("----------------------------------------");
	}
}

