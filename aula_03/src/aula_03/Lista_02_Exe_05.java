package aula_03;

import java.util.Scanner;

public class Lista_02_Exe_05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double total = 0;
		String produto = "";

		System.out.println("*****************************************************");
		System.out.println("              Lanchonete do Severino                 ");
		System.out.println("*****************************************************");
		System.out.println("                Qual será o pedido?                  ");
		System.out.println("1 - Cachorro Quente                                  ");
		System.out.println("2 - X-Salada                                         ");
		System.out.println("3 - X-Bacon                                          ");
		System.out.println("4 - Bauru                                            ");
		System.out.println("5 - Refrigerante                                     ");
		System.out.println("6 - Suco de laranja                                  ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");

		int opcao = leia.nextInt();
		
		System.out.println("Qual a quantidade?");
		double quant = leia.nextDouble();
		
		switch(opcao) {
		case 1: 
			total = 10 * quant;
			produto = "Cachorro Quente";
			break;
		case 2: 
			total = 15 * quant;
			produto = "X-salada";
			break;
		case 3: 
			total = 18 * quant;
			produto = "X-Bacon";
			break;
		case 4: 
			total = 12 * quant;
			produto = "Bauru";
			break;
		case 5: 
			total = 8 * quant;
			produto = "Refrigerante";
			break;
		case 6: 
			total = 13 * quant;
			produto = "Suco de Laranja";
			break;
		default:
			System.out.println("Opção é invalida!");
			leia.close();
			return; //Sair do programa
		}	
		System.out.printf("Produto selecionado: " + produto);
		System.out.printf("\nValor total: R$%.2f",total);
		leia.close();
	}

}
