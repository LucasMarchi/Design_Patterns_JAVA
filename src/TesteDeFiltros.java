import java.util.ArrayList;
import java.util.List;

public class TesteDeFiltros {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(50);
		Conta c2 = new Conta(10000);
		Conta c3 = new Conta(500);
		
		List<Conta> contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Filtro filtro = new FiltroMenorQue100Reais(new FiltroMaiorQue500MilReais());
		List<Conta> contasFiltradas = filtro.filtrar(contas);
		
		contasFiltradas.forEach(conta -> System.out.println(conta.getSaldo()));
	}

}
