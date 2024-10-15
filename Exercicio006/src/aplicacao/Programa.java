package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> List = new ArrayList<>();

		System.out.print("quantos funcionários serão registrados: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.println("funcionário #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			System.out.println();
			Empregado emp = new Empregado(id, nome, salario);
			List.add(emp);
		}

		System.out.print("Insira o ID do funcionário que terá aumento salarial: ");
		int idSalario = sc.nextInt();
		Integer pos = posicao(List, idSalario);
		if (pos == null) {
			System.out.println("Este id não existe ");
		} else {
			System.out.print("Entre com a porcentagem");
			double porcento = sc.nextDouble();
			List.get(pos).porcentagem(porcento);
		}
		System.out.println();
		System.out.println("Lista de Empregados");
		for (Empregado emp : List) {
			System.out.println(emp);
		}

		sc.close();

	}

	static Integer posicao(List<Empregado> list, int id) { // funcao auxiliar para indicar se o id esta cadastrado
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {			//ele testa se o id digitado consta na lista
				return i;
			}
		}
		return null;
	}

}
