package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class teste_guanabara {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste_guanabara window = new teste_guanabara();
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
	public teste_guanabara() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(new Color(255, 0, 0));
		lblMensagem.setBackground(new Color(255, 0, 0));
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(lblMensagem, BorderLayout.NORTH);
		
		JButton btnClick = new JButton("Clique em Mim!");
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(btnClick, BorderLayout.CENTER);
	}

}
