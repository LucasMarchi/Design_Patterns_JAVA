import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {
		this.outroFiltro = null;
	}
	
	public abstract List<Conta> filtrar(List<Conta> contas); 
	
	protected List<Conta> proximaFiltragem(List<Conta> contas){
		if(outroFiltro != null) return outroFiltro.filtrar(contas);
		else return new ArrayList<>();
	}
	
	
}
