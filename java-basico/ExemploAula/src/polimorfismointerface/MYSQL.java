package polimorfismointerface;

public class MYSQL implements IDb {

	@Override
	public void conectar() {
		System.out.println("Conectado ao MYSQL");		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectado do MYSQL");	
	}

}
