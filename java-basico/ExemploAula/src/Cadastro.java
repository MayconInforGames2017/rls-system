import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField jTxtNome;
	private JTextField jTxtEmail;
	private JTextField jTxtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 86, 30);
		frame.getContentPane().add(lblNewLabel);
		
		jTxtNome = new JTextField();
		jTxtNome.setBounds(70, 16, 231, 20);
		frame.getContentPane().add(jTxtNome);
		jTxtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(10, 52, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		jTxtEmail = new JTextField();
		jTxtEmail.setBounds(70, 52, 231, 20);
		frame.getContentPane().add(jTxtEmail);
		jTxtEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				cliente.setNome(jTxtNome.getText());
				cliente.setEmail(jTxtEmail.getText());
				cliente.setIdade(Integer.parseInt(jTxtIdade.getText()));
				JOptionPane.showMessageDialog(null, cliente.Salvar());
				jTxtNome.setText("");
				jTxtEmail.setText("");
				jTxtIdade.setText("");
			}
		});
		btnNewButton.setBounds(212, 127, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(10, 90, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		jTxtIdade = new JTextField();
		jTxtIdade.setBounds(70, 87, 231, 20);
		frame.getContentPane().add(jTxtIdade);
		jTxtIdade.setColumns(10);
	}
}
