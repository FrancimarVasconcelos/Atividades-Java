package entidade;

public class Estudante {
	
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double restante() {
		return 60 - notaFinal();
	}

}
