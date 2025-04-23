package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_01_Queue {

	public static void main(String[] args) {
				
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();

        String continua = "S";

        while (continua.equalsIgnoreCase("S")) {
     
            System.out.println("*************************************************");
            System.out.println("                     Banco");
            System.out.println("           Seu dinheiro nossa alegria");
            System.out.println("*************************************************");
            System.out.println();
            System.out.println("        1 - Adicionar Clientes na fila");
            System.out.println("        2 - Listar todos os clientes  ");
            System.out.println("        3 - Chamar proximo cliente");
            System.out.println("        0 - Sair");
            System.out.println();
            System.out.println("*************************************************");
            System.out.print("            Digite a opção desejada: ");

            int opcao = leia.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite um nome para entrar na fila: ");
            			leia.skip("\\R");
                        fila.add(leia.nextLine());
                        System.out.println("Cliente adicionado! ");
                        break;
                    case 2:
                        if (fila.isEmpty() == false) {
                            System.out.println("A fila tem um total de " + fila.size() + " clientes aguardando.");
                            System.out.println(fila);
                        } else {
                            System.out.println("A fila está vazia!");
                        }
                        break;
                        
                    case 3:
                        if (fila.isEmpty() == true) {
                            System.out.println("A fila está vazia!");
                        } else {
                            System.out.println("Chegou sua vez " + fila.poll());
                        }break;
                    case 0:
                        System.out.println("Programa finalizado");
                        continua = "n";
                        break;
                    default:
                        System.out.println("\nA opção digitada é invalida! ");
                        return;
                }
                if (opcao != 0) {
                System.out.println("\nDeseja continuar (S/N)? ");
    			leia.skip("\\R");
    			continua = leia.nextLine().toUpperCase();
            }
        }
	}
}


         
