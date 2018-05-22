import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class name {

	private JFrame frame;
	private JTextField txtPlayer;
	private JTextField txtPlayer_1;
	private JButton btnAtPlayer2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					name window = new name();
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
	public name() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 772, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 754, 483);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnXPlayer1 = new JButton("X");
		btnXPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXPlayer1.setBounds(217, 80, 68, 61);
		panel.add(btnXPlayer1);
		
		JButton btnOPlayer1 = new JButton("O");
		btnOPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOPlayer1.setBounds(323, 80, 68, 61);
		panel.add(btnOPlayer1);
		
		JButton buttonAtPlayer1 = new JButton("@");
		buttonAtPlayer1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		buttonAtPlayer1.setBounds(430, 79, 68, 62);
		panel.add(buttonAtPlayer1);
		
		txtPlayer = new JTextField();
		txtPlayer.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtPlayer.setText("Player 1");
		txtPlayer.setBounds(293, 0, 131, 48);
		panel.add(txtPlayer);
		txtPlayer.setColumns(10);
		
		txtPlayer_1 = new JTextField();
		txtPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtPlayer_1.setText("Player 2");
		txtPlayer_1.setBounds(293, 244, 131, 53);
		panel.add(txtPlayer_1);
		txtPlayer_1.setColumns(10);
		
		JButton btnOPlayer2 = new JButton("O");
		btnOPlayer2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnOPlayer2.setBounds(323, 327, 68, 61);
		panel.add(btnOPlayer2);
		
		btnAtPlayer2 = new JButton("@");
		btnAtPlayer2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtPlayer2.setBounds(430, 327, 68, 62);
		panel.add(btnAtPlayer2);
		
		JButton btnXPlayer2 = new JButton("X");
		btnXPlayer2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXPlayer2.setBounds(217, 327, 68, 61);
		panel.add(btnXPlayer2);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 38));
		btnPlay.setBounds(566, 177, 156, 142);
		panel.add(btnPlay);
	}

}
