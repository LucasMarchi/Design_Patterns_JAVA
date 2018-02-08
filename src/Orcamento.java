import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	protected double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void adicionaItem(Item item) {
		this.itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova(Orcamento reforma) {
		estadoAtual.aprova(this);
	}
	
	public void reprova(Orcamento reforma) {
		estadoAtual.reprova(this);
	}
	
	public void finaliza(Orcamento reforma) {
		estadoAtual.finaliza(this);
	}
	
}
