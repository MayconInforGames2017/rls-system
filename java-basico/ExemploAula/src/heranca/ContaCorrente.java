package heranca;

public class ContaCorrente extends Conta {

	// Rescreve o m�todo da classe "pai" Conta
	// Overrding
	public void sacar(double valor) {
		super.sacar(valor);
		this.Juros();
	}
	
	private void Juros() {
		this.saldo -= 1;
	}
	
}
