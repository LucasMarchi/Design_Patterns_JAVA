import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQue500MilReais extends Filtro{
	
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public FiltroMaiorQue500MilReais() {
		this.outroFiltro = null;
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();
		contas.forEach(conta -> {
			if(conta.getSaldo() > 5000) filtrada.add(conta);
		});
		
		filtrada.addAll(proximaFiltragem(contas));
		
		return filtrada;
	}

}
