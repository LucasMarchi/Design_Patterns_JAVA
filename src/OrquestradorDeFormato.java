
public class OrquestradorDeFormato {
	
	public void formatar(Requisicao requisicao, Conta conta) {
		
		Formato f1 = new FormatoEmXML();
		Formato f2 = new FormatoEmPorcentagem();
		Formato f3 = new SemFormato();
		
		f1.setProximo(f2);
		f2.setProximo(f3);
		
		f1.formatar(requisicao, conta);
		
	}

}
