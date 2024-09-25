package entidades;

public class Produtos {
	
	public String nome;
	public double preco;
	public int quantidade;

	public double ValorTotalEstoque() {
		return quantidade * preco;
	}

	public void addProdutos(int quantidades) {
		this.quantidade += quantidades;
	}

	public void removProdutos(int quantidades) {
		this.quantidade -= quantidades;
	}
	
	public String toString() {
		
		return "Dados do produto, " + nome + ", $" + String.format("%.2f", preco) +", "
		+ quantidade + " Unidades"+", Total: $" + String.format("%.2f", ValorTotalEstoque());
	}

}
