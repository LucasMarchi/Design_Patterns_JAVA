public class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) orcamento.valor -= orcamento.valor * 0.05;
		else throw new RuntimeException("Desconto j� aplicado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui n�o posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprova��o n�o podem ir para finalizado diretamente");
	}

}
