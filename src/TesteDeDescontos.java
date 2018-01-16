
public class TesteDeDescontos {
	
	public static void main(String[] args) {
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500);
		orcamento.adicionaItem(new Item("Lapis", 250));
		orcamento.adicionaItem(new Item("Caneta", 300));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}

}
