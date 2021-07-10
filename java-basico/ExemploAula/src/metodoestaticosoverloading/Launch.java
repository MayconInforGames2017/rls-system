package metodoestaticosoverloading;

public class Launch {

	public static void main(String[] args) {
	//	Procedimentos p = new Procedimentos();
		Procedimentos.Escrever("Teste");
		
		Calculadora c = new Calculadora();
		int total = c.Somar(2, 6);
		int total1 = c.Subtrair(2, 6);
		
		System.out.println(total);
		System.out.println(total1);
		System.out.println(c.Copyright());
			
	}
	
}
