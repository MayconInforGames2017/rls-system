package heranca;

import javax.swing.JOptionPane;

public class Conta {

	protected double saldo;
	public int conta;

	public void sacar(double valor) {
		// this.saldo = this.saldo - valor;
		if (this.saldo >= valor) {
			this.saldo -= valor;
			JOptionPane.showMessageDialog(null, " Saque realizado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, " Você não tem limite suficiente para realizar o saque.");
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void consultarSaldo() {
		JOptionPane.showMessageDialog(null, "O saldo da conta é R$: " + this.saldo);
	}

}
