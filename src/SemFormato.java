
public class SemFormato implements Formato {

	@Override
	public void formatar(Requisicao requisicao, Conta conta) {
		System.out.println(conta.getSaldo());
	}

	@Override
	public void setProximo(Formato formato) {
		
	}

}
