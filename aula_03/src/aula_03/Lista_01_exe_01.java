package aula_03;

import java.util.Scanner;

public class Lista_01_exe_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		float n1 = leia.nextFloat();
		System.out.println("Digite o valor de B: ");
		float n2 = leia.nextFloat();
		System.out.println("Digite o valor de C: ");
		float n3 = leia.nextFloat();
		float soma = (n1 + n2);
		
		if (soma > n3) {
			System.out.printf("A soma de A + B é maior que C.");
		}
		if (soma < n3) {
			System.out.printf("A soma de A + B é menor que C." );
		}
		if (soma == n3) {
			System.out.printf("A soma de A + B é igual a C.");
		}
		leia.close();
	}

}
