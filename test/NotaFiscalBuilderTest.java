import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class NotaFiscalBuilderTest {

	@Test
	public void deveCriarNotaFiscal() {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
				.paraEmpresa("Caelum")
				.comCnpj("123.456.789/0001-10")
				.comItem(new ItemDaNota("item 1", 100.0))
				.comItem(new ItemDaNota("item 2", 200.0))
				.comItem(new ItemDaNota("item 3", 300.0))
				.comObservacoes("entregar nf pessoalmente")
				.naDataAtual()
				.constroi();
		
		System.out.println(notaFiscal);
		
		assertNotNull(notaFiscal);
	}

}
