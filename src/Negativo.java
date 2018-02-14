public class Negativo implements EstadoDeUmaConta{

	@Override
	public void sacar(Conta conta, double valor) {
		throw new RuntimeException("Sua conta est� no vermelho. N�o � poss�vel sacar!");
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
		if(conta.saldo > 0) conta.setEstado(new Positivo());
	}

}
