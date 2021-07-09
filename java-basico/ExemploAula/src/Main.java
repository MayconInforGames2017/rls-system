public class Main {

	public static void main(String[] args) {

		// Instancia uma classe => Objeto
		Carro c1 = new Carro();
		//c1.trocarMarcha();
		// c1.desligar();
		c1.ligar();
		c1.freio = false;
		c1.trocarMarcha();
		c1.acelerar(10);
		c1.trocarMarcha();
		c1.acelerar(40);
		c1.trocarMarcha();
		c1.acelerar(60);
		c1.desligar();
		
		Carro c2 = new Carro();
		
	}

}
