package com.github.taveira90.controlebanca.application;

import java.util.Locale;
import java.util.Scanner;

import com.github.taveira90.controlebanca.entities.Bebida;
import com.github.taveira90.controlebanca.entities.Chocolate;
import com.github.taveira90.controlebanca.entities.Revista;
import com.github.taveira90.controlebanca.entities.Salgadinho;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Revista revista = new Revista(0, null, null);
		Chocolate chocolate = new Chocolate(0, null, null);
		Salgadinho salgadinho = new Salgadinho(0, null, null);
		Bebida bebida = new Bebida(0, null, null);
		
		System.out.println("===== CONTROLE =====");
		System.out.println("\n1 - Incluir"
						 + "\n2 - Vender");
		
		char opcao = scanner.next().charAt(0);
		
		if (opcao == '1') {
			do {
				System.out.println("Qual produto deseja incluir?\n"
						+ "\n1 - Revista"
						+ "\n2 - Chocolate"
						+ "\n3 - Salgadinho"
						+ "\n4 - Bebida");
				opcao = scanner.next().charAt(0);
				
				switch (opcao) {
					case '1':
						System.out.println("Inclusão - Revista: ");
						System.out.print("Código: ");
						revista.setCodigo(scanner.nextInt());
						System.out.print("Descrição: ");
						scanner.next();
						revista.setDescricao(scanner.nextLine());
						System.out.print("Editora: ");
						revista.setEditora(scanner.nextLine());
						System.out.print("Valor unitário: ");
						revista.setValorUnitario(scanner.nextDouble());
						System.out.print("Quantidade: ");
						revista.incluiNoEstoque(scanner.nextInt());
						System.out.println("Estoque atual: " + revista.getEstoque());
						break;
					case '2':
						System.out.println("Inclusão - Chocolate");
						System.out.print("Código: ");
						chocolate.setCodigo(scanner.nextInt());
						System.out.print("Descrição: ");
						scanner.next();
						chocolate.setDescricao(scanner.nextLine());
						System.out.print("Marca: ");
						chocolate.setMarca(scanner.nextLine());
						System.out.print("Valor unitario: ");
						chocolate.setValorUnitario(scanner.nextDouble());
						System.out.print("Quantidade: ");
						chocolate.incluiNoEstoque(scanner.nextInt());
						System.out.println("Estoque atual: " + chocolate.getEstoque());
						break;
					case '3':
						System.out.println("Inclusão - Salgadinho");
						System.out.print("Código: ");
						salgadinho.setCodigo(scanner.nextInt());
						System.out.print("Descrição: ");
						scanner.next();
						salgadinho.setDescricao(scanner.nextLine());
						System.out.print("Marca: ");
						salgadinho.setMarca(scanner.nextLine());
						System.out.print("Valor unitario: ");
						salgadinho.setValorUnitario(scanner.nextDouble());
						System.out.print("Quantidade: ");
						salgadinho.incluiNoEstoque(scanner.nextInt());
						System.out.println("Estoque atual: " + salgadinho.getEstoque());
						break;
					case '4':
						System.out.println("Inclusão - Bebida");
						System.out.print("Código: ");
						bebida.setCodigo(scanner.nextInt());
						System.out.print("Descrição: ");
						scanner.next();
						bebida.setDescricao(scanner.nextLine());
						System.out.print("Marca: ");
						bebida.setMarca(scanner.nextLine());
						System.out.print("Valor unitario: ");
						bebida.setValorUnitario(scanner.nextDouble());
						System.out.print("Quantidade: ");
						salgadinho.incluiNoEstoque(scanner.nextInt());
						System.out.println("Estoque atual: " + salgadinho.getEstoque());
						break;
					default:
						System.out.println("Opção inválida");
				}
				
				System.out.println("Deseja incluir outro produto? (s/n)");
				opcao = scanner.next().charAt(0);
				
			} while (opcao != 'n');
			System.out.println("Programa encerrado");
			
		} else if(opcao == '2') {
			do {
				System.out.println("Qual produto deseja vender?\n"
						+ "\n1 - Revista"
						+ "\n2 - Chocolate"
						+ "\n3 - Salgadinho"
						+ "\n4 - Bebida");
				opcao = scanner.next().charAt(0);
				
				switch (opcao) {
				case '1':
					System.out.println("Venda - Revista");
					revista.incluiNoEstoque(100); 
					System.out.print("Quantidade: ");
					revista.retiraDoEstoque(scanner.nextInt());
					System.out.println("Venda realizada.");
					System.out.println("Estoque atual: " + revista.getEstoque());
					break;
				case '2':
					System.out.println("Venda - Chocolate");
					chocolate.incluiNoEstoque(100);
					System.out.print("Quantidade");
					chocolate.retiraDoEstoque(scanner.nextInt());
					System.out.println("Venda realizada.");
					System.out.println("Estoque atual: " + chocolate.getEstoque());
					break;
				case '3':
					System.out.println("Venda - Salgadinho");
					salgadinho.incluiNoEstoque(100);
					System.out.print("Quantidade: ");
					salgadinho.retiraDoEstoque(scanner.nextInt());
					System.out.println("Venda realizada.");
					System.out.println("Estoque atual: " + salgadinho.getEstoque());
					break;
				case '4':
					System.out.println("Venda - Bebida");
					bebida.incluiNoEstoque(100);
					System.out.print("Quantidade: ");
					bebida.retiraDoEstoque(scanner.nextInt());
					System.out.println("Venda realizada.");
					System.out.println("Estoque atual: " + bebida.getEstoque());
					break;
				default:
					System.out.println("Opção inválida");
			}
				System.out.println("Deseja vender outro produto? (s/n)");
				opcao = scanner.next().charAt(0);
				
			} while (opcao != 'n');
			System.out.println("Programa encerrado");
			
		} else {
			System.out.println("Opção inválida! Execute novamente.");
		}
		
		
		scanner.close();
	}

}
