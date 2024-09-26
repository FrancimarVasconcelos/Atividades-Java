package entidades;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return (largura + altura) * 2;
	}
	
	
}
