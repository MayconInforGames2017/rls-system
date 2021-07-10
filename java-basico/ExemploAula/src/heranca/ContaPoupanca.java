package heranca;

// Final class não permite que essa classe seja herdada
public final class ContaPoupanca extends Conta {

	public void depositar(double valor) {
		super.depositar(valor);
		this.juros();
	}
	
	@Override
	protected void juros() {
		this.saldo += 1;
	}
	
}
