package heranca;

public class LaunchBanco {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(100);
		c1.sacar(50);
		c1.consultarSaldo();
		
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.depositar(1000);
		cp1.sacar(50);
		cp1.consultarSaldo();
		
	}

}
