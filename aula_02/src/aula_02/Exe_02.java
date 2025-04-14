package aula_02;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);{
		
		//perguntando valor das notas
		System.out.println("Digite a nota 1: ");
		float nota01 = leia.nextFloat();
			
		System.out.println("Digite a nota 2: ");
		float nota02 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		float nota03 = leia.nextFloat();
		
		System.out.println("Digite a nota 4");
		float nota04 = leia.nextFloat();
			
		//fazendo a soma de todas as notas e depois dividindo, lembrando que () faz o calculo primeiro
		float medianota = (nota01 + nota02 + nota03 + nota04) / 4;
	
		//Mostra o resultado
		System.out.printf("Média final: %.1f", (medianota));
		
	}
  }
}
