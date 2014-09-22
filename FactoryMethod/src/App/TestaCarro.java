package App;

public class TestaCarro {

	public static void main(String[] args) {
		FactoryCarro factory = new FactoryCarro();
		String preco = "25.000";
		String cor = "Preto";
		factory.getCarro(preco, cor);

	}

}
