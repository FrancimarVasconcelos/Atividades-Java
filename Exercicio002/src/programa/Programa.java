package programa;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com valores do retangulo de largura e altura");
		ret.altura = sc.nextDouble();
		ret.largura = sc.nextDouble();
		
		System.out.print("AREA = " + String.format("%.2f", ret.area()));
		System.out.println();
		System.out.print("PARAMETRO = " + String.format("%.2f", ret.perimetro()));
		System.out.println();
		System.out.println("DIAGONAL = " + String.format("%.2f", ret.diagonal()));
		
		sc.close();
	}

}
