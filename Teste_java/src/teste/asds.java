package teste;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class asds {

	public static void main(String[] args) {
        String continua;

                Scanner leia = new Scanner(System.in);
                Queue<String> filaClientes = new LinkedList<>();
                int opcao;

                do {
                    // Exibe o menu
                    System.out.println("\n===========================================");
                    System.out.println("                 BANCO DIGITAL");
                    System.out.println("         Organização da Fila de Clientes");
                    System.out.println("===========================================");
                    System.out.println("1 - Adicionar cliente à fila");
                    System.out.println("2 - Listar clientes na fila");
                    System.out.println("3 - Chamar próximo cliente");
                    System.out.println("0 - Sair");
                    System.out.println("===========================================");
                    System.out.print("Digite a opção desejada: ");
                    
                    opcao = leia.nextInt();
                    leia.nextLine(); // Limpa o buffer

                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o nome do cliente: ");
                            String nome = leia.nextLine();
                            filaClientes.add(nome);
                            System.out.println("Cliente " + nome + " adicionado à fila.");
                            break;

                        case 2:
                            if (filaClientes.isEmpty()) {
                                System.out.println("A fila está vazia.");
                            } else {
                                System.out.println("Clientes na fila:");
                                for (String cliente : filaClientes) {
                                    System.out.println(" - " + cliente);
                                }
                            }
                            break;

                        case 3:
                            if (filaClientes.isEmpty()) {
                                System.out.println("A fila está vazia. Nenhum cliente para chamar.");
                            } else {
                                String chamado = filaClientes.poll();
                                System.out.println("Cliente chamado: " + chamado);
                            }
                            break;

                        case 0:
                            System.out.println("Encerrando o programa...");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }

                } while (opcao != 0);

                leia.close();
            }
        }

