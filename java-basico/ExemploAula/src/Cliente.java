import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Cliente {

	private String nome;
	private String email;
	private int idade;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String Salvar() {
		File fl = new File("clientes.txt");

		// se o arquivo não existe
		if (fl.exists()) {
			try {
				// o arquivo é criado
				fl.createNewFile();
				FileWriter writer = new FileWriter(fl);
				writer.write(this.nome + " - " + this.email + " - " + this.idade);
				writer.flush();
				writer.close();
			} 
			catch (Exception e) {
				return "Erro no sistema. Msg: " + e.getMessage();
			}
		}
		return "Sucesso ao cadastrar";
	}

}
