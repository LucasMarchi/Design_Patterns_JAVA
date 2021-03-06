
public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) orcamento.valor -= orcamento.valor * 0.05;
		else throw new RuntimeException("Desconto j� aplicado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// jah estou em aprovacao
		throw new RuntimeException("Or�amento j� est� em estado de aprova��o");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// nao pode ser reprovado agora!
		throw new RuntimeException("Or�amento est� em estado de aprova��o e n�o pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado de finalizado
		orcamento.estadoAtual = new Finalizado();
	}

}
