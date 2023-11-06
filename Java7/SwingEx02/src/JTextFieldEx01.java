import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JTextFieldEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JLabel lbl1;
	private JTextField textField2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldEx01 frame = new JTextFieldEx01();
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
	public JTextFieldEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(12, 10, 222, 21);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println( textField1.getText() );
				
//				lbl1.setText( textField1.getText() );
//				textField2.setText( textField1.getText() );
				
//				System.out.println( passwordField.getText() );
				System.out.println( new String( passwordField.getPassword() ) );
			}
		});
		btn.setBounds(12, 41, 222, 23);
		contentPane.add(btn);
		
		lbl1 = new JLabel("New label");
		lbl1.setBounds(12, 74, 222, 15);
		contentPane.add(lbl1);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setBounds(12, 99, 222, 21);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(12, 142, 222, 21);
		contentPane.add(passwordField);
	}
}
