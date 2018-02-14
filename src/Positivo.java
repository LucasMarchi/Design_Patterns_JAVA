
public class Positivo implements EstadoDeUmaConta {

	@Override
	public void sacar(Conta conta, double valor) {
		conta.saldo -= valor;
		if(conta.saldo <= 0) conta.setEstado(new Negativo());
	}

	@Override
	public void depositar(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
	}

}
