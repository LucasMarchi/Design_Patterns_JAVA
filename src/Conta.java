
public class Conta {

	protected double saldo;
	private EstadoDeUmaConta estado;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double saldo) {
		this.saldo += saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public EstadoDeUmaConta getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeUmaConta estado) {
		this.estado = estado;
	}
	
}
