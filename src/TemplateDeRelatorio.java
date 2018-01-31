import java.util.List;

public abstract class TemplateDeRelatorio {

	protected abstract void cabecalho();
	protected abstract void corpo(List<Conta> contas);
	protected abstract void rodape();
	
	public final void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}
}
