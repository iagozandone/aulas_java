package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int inicio, fim, contador;
		
		//Entrada do primeiro numero
		System.out.println("Digite o priemrio número do intervalo: ");
		inicio = leia.nextInt();
		
		//Entrada do segundo numero
		System.out.println("Digite o priemrio número do intervalo: ");
		fim = leia.nextInt();
		
		//Verificação
		if (inicio >= fim) {
			System.out.println("Intevalo inválido");
		}else {
			System.out.printf("No intervalo entre %d e %d: \n", inicio, fim );
		}
		//Contador, comeca com o inicio que foi digitado e vai até o fim digitado verificando se divide por 3 e 5 e o resultado é 0, se for escreve na tela
			for (contador = inicio; contador <= fim; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0 && contador !=0) {
					System.out.printf(contador + " é multiplo de 3 e 5\n");
				}
			}
		leia.close();
	}
}
