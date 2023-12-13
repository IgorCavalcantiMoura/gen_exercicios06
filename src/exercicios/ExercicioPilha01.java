package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha01 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		String nome;
		
		do {
			System.out.println("\n************************MENU************************");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros na pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
				
				case 1: 
					System.out.println("Digite o nome do livro");
					nome = leia.nextLine(); 
					pilha.push(nome);
					System.out.println(pilha);
					System.out.println("Livro adicionado!");
					break;
				case 2:
					System.out.println(pilha);
					break;
				case 3: 
					if(pilha.isEmpty()== true) {
						System.out.println("A fila está vazia!");
					}else {pilha.pop();
						System.out.println(pilha);
						System.out.println("O(a) cliente foi chamado(a)!");
					}
					break;
				default:
					System.out.println("Opção inválida!");
			}
			
		}while(opcao!=0);

	}

}
