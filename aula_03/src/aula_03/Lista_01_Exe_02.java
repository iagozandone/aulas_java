package aula_03;

import java.util.Scanner;

public class Lista_01_Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = leia.nextInt();
		
		if (n1 % 2 !=0 && n1 > 0) {
			System.out.println("O Número " + n1 + " é impar e positivo!");
		}else if (n1 % 2 !=0 && n1 < 0) {
			System.out.println("O Número " + n1 + " é impar e negativo!");
		}else if (n1 % 2 ==0 && n1 > 0) {
			System.out.println("O Número " + n1 + " é par e positivo!");
		}else if (n1 % 2 ==0 && n1 < 0) {
			System.out.println("O Número " + n1 + " é par e negativo!");
		}else { System.out.println("Numero digitado é zero!");
		}
		leia.close();
	}
}
