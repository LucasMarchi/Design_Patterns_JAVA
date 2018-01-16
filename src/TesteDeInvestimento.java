
public class TesteDeInvestimento {

	public static void main(String[] args) {
		Conta conta = new Conta(100);
		Investimento investimento = new Arrojado();
		RealizadorDeInvestimento realizador = new RealizadorDeInvestimento();
		realizador.realiza(conta, investimento);
	}
}
