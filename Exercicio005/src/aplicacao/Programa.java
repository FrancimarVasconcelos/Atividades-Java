package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Banco;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Banco banco = new Banco();

		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o titular da conta: ");
		String nome = sc.nextLine();
		
		banco = new Banco(conta, nome);
		
		System.out.print("Existe um depósito inicial (s/n)? ");
		char simNao = sc.next().charAt(0);
		if (simNao == 's') {
			System.out.print("Insira o valor do depósito inicial: ");
			double desposito = sc.nextDouble();
			System.out.println();
			banco.Deposito(desposito);
			System.out.println("Dados da conta: ");
			System.out.println(banco);
		}else {
			System.out.println();
			System.out.println("Dados da conta: ");
			System.out.println(banco);
			System.out.println();
		}
			System.out.println();
			System.out.print("Insira um valor de depósito: ");
			double desposito = sc.nextDouble();
			banco.Deposito(desposito);
			System.out.println("Dados atualizados da conta ");
			System.out.println(banco);
			System.out.println();
			
			System.out.print("Insira um valor de retirada: ");
			double sacar = sc.nextDouble();
			banco.Saque(sacar);
			System.out.println("Dados atualizados da conta ");
			System.out.println(banco);
			System.out.println();
			
			
			sc.close();
		}
	}

