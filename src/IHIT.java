import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional{
	
	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IHIT() {
		super();
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String> aux = new ArrayList<>();

        for(Item item : orcamento.getItens()) {
          if(aux.contains(item.getNome())) return true;
          else aux.add(item.getNome());
        }
        
		return false;
	}
	
	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

}
