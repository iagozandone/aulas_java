package aula_02;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in); {
		
	//perguntado salario
	System.out.println("Digite seu salário: ");
	float salario = leia.nextFloat();
	
	System.out.println("Digite o valor do abono: ");
	float abono = leia.nextFloat();
	
	//calcula salario + abono
	float nvSalario = salario + abono;
	
	//mostra o novo salario
	System.out.printf("Seu novo salário é: \nR$ %.2f", (nvSalario));
		
	}
  }
}
