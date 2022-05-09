package psoft;

public class Main {

	public static void main(String[] args) {
		Produto p = new Produto("Leite", "Exemplo");
		Lote l1 = new Lote(p, 10, "09/05/2022", "09/06/2022");
		System.out.println(p.toString());
		System.out.println(l1.toString());
	}

}
