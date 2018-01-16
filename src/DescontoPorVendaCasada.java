
public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(existe("Lapis", orcamento) && existe("Caneta", orcamento)) {
			return orcamento.getValor() * 0.05;
		}else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }

}
