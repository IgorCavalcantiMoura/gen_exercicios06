package exercicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila01 {

	public static void main(String[] args) {
		Queue<String> nomes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String nome;
		
		do {
			System.out.println("\n************************MENU************************");
			System.out.println("1: Adicionar um novo cliente a fila");
			System.out.println("2: Listar todos os clientes na fila");
			System.out.println("3: Chamar e retirar uma pessoa da fila");
			System.out.println("0: Sair");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
				
				case 1: 
					System.out.println("Digite o nome");
					nome = leia.nextLine(); 
					nomes.add(nome);
					System.out.println(nomes);
					System.out.println("Cliente adicionado!");
					break;
				case 2:
					System.out.println(nomes);
					break;
				case 3: 
					if(nomes.isEmpty()== true) {
						System.out.println("A fila está vazia!");
					}else {nomes.poll();
						System.out.println(nomes);
						System.out.println("O(a) cliente foi chamado(a)!");
					}
					break;
				default:
					System.out.println("Opção inválida!");
			}
			
		}while(opcao!=0);
		
		
		
		

	}

}
