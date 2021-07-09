import javax.swing.JOptionPane;

public class Carro {

	// Atributos
	public String marca;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public int velocidade;
	public boolean freio = true;

	// Métodos
	public void ligar() {

		if (this.ligado == false) {
			this.ligado = true;
			JOptionPane.showMessageDialog(null, "Carro ligado");
		} else {
			JOptionPane.showMessageDialog(null, "Carro já está ligado");
		}
	}

	public void acelerar(int velocidade) {

		if (this.ligado == true) {
			if (this.freio == false) {
				if (this.marcha == 0) {
					JOptionPane.showMessageDialog(null, "Está em ponto morto");
				} else if (this.marcha == 1) {
					if (velocidade < 30) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null,  this.velocidade);
					}
				} else if (this.marcha == 2) {
					if (velocidade < 50) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null, this.velocidade);
					}
				}
				else if (this.marcha == 3) {
					if (velocidade < 80) {
						this.velocidade = velocidade;
						JOptionPane.showMessageDialog(null, this.velocidade);
					}
				}
			}
		}
	}

	public void desligar() {

		if (this.ligado = true) {
			this.ligado = false;
			JOptionPane.showMessageDialog(null, "Carro desligado");
		} else {
			JOptionPane.showMessageDialog(null, "O carro não está ligado");
		}
	}

	public void trocarMarcha() {
		this.marcha = this.marcha + 1;
		JOptionPane.showMessageDialog(null, "Troca de marcha");
	}

}
