
public interface Formato {

	void formatar(Requisicao requisicao, Conta conta);
	void setProximo(Formato formato);
}
