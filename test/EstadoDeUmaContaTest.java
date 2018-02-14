import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadoDeUmaContaTest {
	
	private Conta conta;
	
	@BeforeEach
	public void init() {
		conta = null;
	}
	
	@Test
	public void contaNegativaNaoDeveAceitarSaques() {
		conta = new Conta(-100);
		conta.setEstado(new Negativo());
		assertThrows(RuntimeException.class, () -> conta.getEstado().sacar(conta, 100));
	}
	
	@Test
	public void contaNegativaDeveDepositar95PorCentoDoValor() {
		conta = new Conta(-100);
		conta.setEstado(new Negativo());
		conta.getEstado().depositar(conta, 100);
		assertEquals(-5, conta.saldo);
	}
	
	@Test
	public void contaPositivaDeveAceitarSaques() {
		conta = new Conta(100);
		conta.setEstado(new Positivo());
		conta.getEstado().sacar(conta, 100);
		assertEquals(0, conta.saldo);
	}
	
	@Test
	public void contaPositivaDeveDepositar98PorCentoDoValor() {
		conta = new Conta(100);
		conta.setEstado(new Positivo());
		conta.getEstado().depositar(conta, 100);
		assertEquals(198, conta.saldo);
	}

}
