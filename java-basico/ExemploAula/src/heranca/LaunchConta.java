package heranca;

import javax.swing.JOptionPane;

public class LaunchConta {

	public static void main(String[] args) {

		String acao = JOptionPane.showInputDialog("Digite o tipo de conta");

		Conta conta;
		
		if (acao.equals("c")) {
			conta = new ContaCorrente();
		}
		else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(100);
		conta.sacar(10);
	}

}
