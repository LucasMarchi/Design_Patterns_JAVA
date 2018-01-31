import java.util.ArrayList;
import java.util.List;

public class FiltroMenorQue100Reais extends Filtro{
	
	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public FiltroMenorQue100Reais() {
		this.outroFiltro = null;
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();
		contas.forEach(conta -> {
			if(conta.getSaldo() < 100) filtrada.add(conta);
		});
		
		filtrada.addAll(proximaFiltragem(contas));
		
		return filtrada;
	}

}
