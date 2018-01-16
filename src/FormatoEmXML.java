
public class FormatoEmXML implements Formato{

	private Formato proximo;
	@Override
	public void formatar(Requisicao requisicao, Conta conta) {
		if(requisicao.getFormato() == TipoFormato.XML) {
			System.out.println("<conta><saldo>" + conta.getSaldo() + "</saldo></conta>");
		}else {
			proximo.formatar(requisicao, conta);
		}
	}

	@Override
	public void setProximo(Formato formato) {
		this.proximo = formato;
	}

}
