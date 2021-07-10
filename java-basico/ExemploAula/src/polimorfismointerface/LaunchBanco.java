package polimorfismointerface;

import javax.swing.JOptionPane;

public class LaunchBanco {

	public static void main(String[] args) {

		IDb db;
		
		String acao = JOptionPane.showInputDialog("Digite o tipo de banco");
		
		if (acao.equals("m")) {
			db = new MYSQL();
		}
		else {
			db = new Oracle();
		}
		
		db.conectar();
		db.desconectar();

	}

}
