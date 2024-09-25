package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Programa {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos produto = new Produtos();
		
		System.out.println("Entre com dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println(produto);
		System.out.println();
		System.out.print("Entre com a quantidade de produto que vai entrar no estoque: ");
		int quantidades = sc.nextInt();
		System.out.println();
		produto.addProdutos(quantidades);
		System.out.println(produto);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos que vai sair do estoque: ");
		quantidades = sc.nextInt();
		produto.removProdutos(quantidades);
		System.out.println();
		
		System.out.println(produto);

		sc.close();
		
	}

}
