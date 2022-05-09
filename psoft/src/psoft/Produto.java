package psoft;

public class Produto {
	private String id, nome, fabricante;

	public Produto(String nome, String fabricante) {
		this.id = "0001";
		this.nome = nome;
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", fabricante=" + fabricante + "]";
	}
}
