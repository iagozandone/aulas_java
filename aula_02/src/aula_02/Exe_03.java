package aula_02;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in); {
			
			//perguntado notas
			System.out.println("Digite seu salário: ");
			float salario = leia.nextFloat();
			
			System.out.println("Digite o valor do adicional noturno: ");
			float adcnoturno = leia.nextFloat();
			
			System.out.println("Digite o valor das horas extras: ");
			float hrextras = leia.nextFloat();
			
			System.out.println("Valor dos descontos: ");
			float desconto = leia.nextFloat();
			
			//fazendo os calculos 
			float saliquido = salario + adcnoturno + (hrextras * 5) - desconto ;
			
			//mostrando resultado
			System.out.printf("Salário liquido: \nR$ %.2f", (saliquido));
				
		}
	}
}
