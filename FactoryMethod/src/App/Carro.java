package App;

public abstract class Carro{
	protected String preco;
	protected String cor; 
	class Popular extends Carro {
		public Popular(String preco) {
			this.preco = preco;
			System.out.println("O Preço do carro Popular é :" + this.preco); }
	}
	class Esportivo extends Carro{

		public Esportivo(String preco) { 
			this.preco = preco;

			System.out.println("O Preço do carro Esportivo é :" + this.preco); }
		
	}
}