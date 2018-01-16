
public class FormatoEmPorcentagem implements Formato{

	private Formato proximo;

	@Override
	public void formatar(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == TipoFormato.PORCENTO) {
			System.out.println(conta.getSaldo() + " %");
		} else {
			proximo.formatar(requisicao, conta);
		}
	}

	@Override
	public void setProximo(Formato formato) {
		this.proximo = formato;
	}

}
