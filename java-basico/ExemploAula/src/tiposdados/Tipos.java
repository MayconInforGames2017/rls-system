package tiposdados;

public class Tipos {

	public static void main(String[] args) {
		String[] paises = { "Argentina", "Alemanha", "Brasil", "Espanha" };

		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}

		System.out.println();

		for (String pais : paises) {
			System.out.println(pais);
		}
		
		int e = 0;
		while (e < 5) {
			System.out.println(paises[e]);
			e++;
		}
	}

}
