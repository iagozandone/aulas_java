package aula_02;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); {
			
		//Perguntado notas
		System.out.println("Digite o 1º valor: ");
		float n1 = leia.nextFloat();
			
		System.out.println("Digite o 2º valor: ");
		float n2 = leia.nextFloat();
			
		System.out.println("Digite o 3º valor: ");
		float n3 = leia.nextFloat();
			
		System.out.println("Digite o 4º valor: ");
		float n4 = leia.nextFloat();
			
		//Fazendo os calculos 
		float calculo = (n1*n2) - (n3*n4);
			
		//Mostrando resultado
		System.out.printf("A diferença de entre os produtos é: %.1f", (calculo));
	}
  }
}
