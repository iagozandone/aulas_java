package Exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero1 = 1, soma = 0;
		
		do {//pede a entrada do numero positivo ou negativo
			System.out.printf("Digite um número: ");
			numero1 = leia.nextInt();
			
			
			//Analisando se n1 é igual a 0, se for para a repetição
			if (numero1 > 0){
			soma = soma + numero1;
			
		}//se n1 for diferente (!=) de 0 ele vai continuar a rodar o programa.
		}while (numero1 != 0);
		System.out.printf("\nA soma do números positivos é: " + soma);
	
		leia.close();	
	}

}
