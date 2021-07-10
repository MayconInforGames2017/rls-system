package heranca;

public final class ContaCorrente extends Conta {

	// Rescreve o método da classe "pai" Conta
	// Overrding
	@Override
	// A assinatura @Override dá segurança a classe
	public void sacar(double valor) {
		super.sacar(valor);
		this.juros();
	}
	
	@Override
	protected void juros() {
		this.saldo -= 1;
	}
	
}
