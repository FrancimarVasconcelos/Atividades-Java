package entidade;

public class Banco {

	private int conta;
	private String nome;
	private double saldo;
	
	public Banco() {
	
	}
	

	public Banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}


	public void Deposito(double deposito) {
		saldo += deposito;
	}
	
	public void Saque (double sacar) {
		saldo -= sacar +5.0;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "Conta "+ conta + ", " + "Titular: " + nome + ", " + "Saldo " + String.format("%.2f",saldo);
	}

	
}
