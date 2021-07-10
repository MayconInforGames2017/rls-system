package heranca;

public final class ContaCorrente extends Conta {

	// Rescreve o m�todo da classe "pai" Conta
	// Overrding
	@Override
	// A assinatura @Override d� seguran�a a classe
	public void sacar(double valor) {
		super.sacar(valor);
		this.juros();
	}
	
	@Override
	protected void juros() {
		this.saldo -= 1;
	}
	
}
