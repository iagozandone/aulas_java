package aula_03;

import java.util.Scanner;

public class Lista_02_Exe_07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		//Leia os numeros desejado pelo usuario
		System.out.println("Digite o primeiro numero: ");
		float n1 = leia.nextFloat();
		System.out.println("Digtie o segundo numero: ");
		float n2 = leia.nextFloat();

		//Tabela a ser exibida
		System.out.println("*****************************************************");
		System.out.println("                    Calculadora                      ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("1 - Soma                                             ");
		System.out.println("2 - Subtração                                        ");
		System.out.println("3 - Multiplicação                                    ");
		System.out.println("4 - Divisão                                          ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Digite a opção desejada:                             ");
		
		
		System.out.println("Escolha a operação que deseja: (1 a 4)");
		int operacao = leia.nextInt();
		

		switch(operacao) {
		case 1: 
			float result = (n1 + n2);
			System.out.printf("A soma de %.1f + %.1f = %.1f ", n1, n2, result);
			break;
		case 2:
			result = (n1 - n2);
			System.out.printf("A subtração de %.1f - %.1f = %.1f ", n1, n2, result);
			break;
		case 3:
			result = (n1 * n2);
			System.out.printf("A muliplicação de %.1f * %.1f = %.1f ", n1, n2, result);
			break;
		case 4:
			result = (n1 / n2);
			System.out.printf("A divisão de %.1f / %.1f = %.1f ", n1, n2, result);
			break;
		default:
			System.out.println("Opção é invalida!");
			leia.close();
			return; //Sair do programa
		}
			
		leia.close();
	}

}

