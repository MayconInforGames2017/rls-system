package heranca;

import javax.swing.JOptionPane;

public abstract class Conta {

	protected double saldo;
	public int conta;
	public String nome;

	public void sacar(double valor) {
		// this.saldo = this.saldo - valor;
		if (this.saldo >= valor) {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, " Saque realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, " Você não tem limite suficiente para realizar o saque.");
		}
	}
	
	// Método Abstrato
	protected abstract void juros();

	public void depositar(double valor) {
		this.saldo += valor;
		if (valor >= 100) {
			JOptionPane.showMessageDialog(null, " Você foi sorteado.");
		}
	}

	public void consultarSaldo() {
		JOptionPane.showMessageDialog(null, "O saldo da conta é R$: " + this.saldo);
	}

}
