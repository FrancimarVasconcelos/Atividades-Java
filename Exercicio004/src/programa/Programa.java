package programa;

import java.util.Locale;
import java.util.Scanner;

import entidade.Estudante;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		estudante.aluno = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		System.out.println();
		System.out.print("Grade Final = " + estudante.notaFinal());
		System.out.println();
		
		if(estudante.notaFinal() < 60) {
			System.out.println("Reprovado " + estudante.restante()+ " Pontos");
		}else {
			System.out.println("Aprovado");
		}
		
		
		sc.close();
	}

}
