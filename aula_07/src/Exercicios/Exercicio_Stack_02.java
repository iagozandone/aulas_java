package Exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio_Stack_02 {

	public static void main(String[] args) {

		
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int continua = 1;
       
        while (continua != 0) {
            System.out.println("\n*************************************************");
            System.out.println("                   Biblioteca");
            System.out.println("        Organização de Livros em Pilha");
            System.out.println("*************************************************");
            System.out.println("1 - Adicionar um novo livro na pilha");
            System.out.println("2 - Listar todos os livros da pilha");
            System.out.println("3 - Retirar um livro da pilha");
            System.out.println("0 - Finalizar o programa");
            System.out.println("*************************************************");
            System.out.print("Digite uma opção: ");

            int opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);

                    System.out.println("\nPilha:");
                    for (String l : pilha) {
                        System.out.println(l);
                    }

                    System.out.println("\nLivro adicionado!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nLista de Livros na Pilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                    } else {
                        pilha.pop(); 
                        
                                System.out.println("\nPilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }

                        System.out.println("\nUm Livro foi retirado da pilha!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    continua = 0;
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        leia.close();
    }
}