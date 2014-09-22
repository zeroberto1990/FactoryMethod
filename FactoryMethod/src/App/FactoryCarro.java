package App;

public class FactoryCarro {
	
	public static Carro getCarro (String preco, String cor) {
		if (cor == null)
			return null;
		if (cor.equals("Branco"))
			return new Popular(preco);
	    if (cor.equals("Preto"))
			return new Esportivo(preco);
	  
	    else return null;
		}
	} 


