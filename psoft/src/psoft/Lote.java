package psoft;

public class Lote {
	private String id;
	private Produto prod;
	private String data, dataV;
	private int qtd;
	
	public Lote(Produto prod, int qtd, String data, String dataV){
		this.id = "0001";
		this.prod = prod;
		this.qtd = qtd;
		this.data = data;
		this.dataV = dataV;
	}

	@Override
	public String toString() {
		return "Lote [id=" + id + ", prod=" + prod + ", data=" + data + ", dataV=" + dataV + ", qtd=" + qtd + "]";
	}
}
