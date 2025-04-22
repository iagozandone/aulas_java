package teste;

import java.util.Arrays;

public class Vetor05 {

	public static void main(String[] args) {
		
		//Criação do Vettor
		int v[] = new int [20];
		
		//Colocando o mesmo valor para todos os vetores 
		Arrays.fill(v, 0);
		
		//mostrando todos os valores com for int
		for(int valor : v){
			System.out.print( valor + " ");
		}
		
		
	}

}
