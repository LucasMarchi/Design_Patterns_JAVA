import java.util.List;

public class RelatorioSimples extends TemplateDeRelatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Saldo: " + conta.getSaldo());
		}
	}

	@Override
	protected void rodape() {
		System.out.println("(11) 1234-5678");
	}

}
