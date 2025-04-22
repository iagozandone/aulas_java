package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_CollectionArrayList_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ArrayList <String> cores = new ArrayList<String>();
		cores.add(null);
		cores.add(null);
		cores.add(null);
		cores.add(null);
		cores.add(null);

		//Vai começar com um laço de repetição para digitar as 5 cores.
		for(int i=0; i < 5; i++) {	
			
			//Aqui vai escrever na tela para o usuario digitar as cores. O i começa com 0 por isso coloca i+1 pra não aparecer "Digite o 0º valor".
			System.out.print("Digite a " + (i+1) + "º cor: ");
			
			//Aqui vai ler cada cor e salvar na ArrayList cores
			cores.set(i, leia.next());
			
		}//aqui finaliza o laço de repetição
		
		System.out.println("\nAqui estão todas as cores Listadas: ");
		//uma forma mais simples de usar o forEach para que ele percorra toda a ArrayList e mostre na tela.
		cores.forEach(System.out:: println);
		
		cores.sort(null);
		System.out.println("\nAqui está as cores ordenadas: ");
		//uma forma mais simples de usar o forEach para que ele percorra toda a ArrayList e mostre na tela.
		cores.forEach(System.out:: println);
		
		leia.close();
	}

}
