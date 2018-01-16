
public class TesteDeFormato {
	
	public static void main(String[] args) {

		Conta conta = new Conta(500);
		Requisicao requisicao = new Requisicao(TipoFormato.XML);
		
		OrquestradorDeFormato formatador = new OrquestradorDeFormato();
		formatador.formatar(requisicao, conta);
		
	}

}
