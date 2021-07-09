package heranca;

public class ContaPoupanca extends Conta {

	public void depositar(double valor) {
		super.depositar(valor);
		this.Juros();
	}
	
	private void Juros() {
		this.saldo += 1;
	}
	
}
