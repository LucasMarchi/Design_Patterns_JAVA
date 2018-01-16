
public class TesteDeImpostos {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		Imposto imposto = new ICCC();
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		calculador.calcula(reforma, imposto);
	}
	
}
