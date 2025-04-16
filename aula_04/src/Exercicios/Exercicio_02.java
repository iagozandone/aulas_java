package Exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		//declaração de variavel
		int num01= 0, totalPar = 0,totalImpar = 0;
		
		// For começa a fazer o laço de repetição 10 vezes
		for(int contador = 1; contador <=10; contador ++) {
			System.out.printf("Digite o " + contador + "º número: ");
			num01 = leia.nextInt();
			
			//se o numero digitado for /2 e a sobra for 0 então adciona mais um ao total par
			if (num01 % 2 == 0 ) {
				totalPar++;
				
				//senão se o numero digitado for /2 e a sobra for diferente de 0 então adciona mais um ao total impar
			}else {
				totalImpar++;
			}
	}
			// mostra o total de numeros impar e par
			System.out.println("\nTotal de numeros pares: " + totalPar);
			System.out.println("Total de numeros impares: " + totalImpar);
	
		leia.close();
		}
		
	}
