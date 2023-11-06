import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class GridLayoutEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEx02 frame = new GridLayoutEx02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GridLayoutEx02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 572, 76);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(42, 24, 185, 24);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(349, 24, 185, 24);
		panel.add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("~");
		lblNewLabel.setBounds(262, 29, 57, 15);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 86, 572, 443);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 3, 0, 0));
		
		JButton btnNewButton = new JButton("7");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		panel_1.add(btnNewButton_5);
		
		JButton btn1 = new JButton("1");
		panel_1.add(btn1);
		
		JButton btnNewButton_7 = new JButton("2");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		panel_1.add(btnNewButton_8);
		
		JButton btn0 = new JButton("0");
		panel_1.add(btn0);
		
		JButton btnDel = new JButton("del");
		panel_1.add(btnDel);
		
		JButton btnCheck = new JButton("검사");
		panel_1.add(btnCheck);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 539, 572, 96);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("결과 : ");
		textArea_2.setBounds(44, 36, 479, 24);
		panel_2.add(textArea_2);
	}

}
