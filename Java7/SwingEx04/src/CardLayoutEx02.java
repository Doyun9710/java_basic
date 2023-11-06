import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class CardLayoutEx02 extends JFrame {

	private JPanel contentPane;
	private JPanel panel2;
	private JTextArea textArea3;
	private JTextArea textArea2;
	private JTextArea textArea1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutEx02 frame = new CardLayoutEx02();
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
	public CardLayoutEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("1단");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_1 name_336568094957400
				((CardLayout)panel2.getLayout()).show( panel2, "name_336568094957400" );
				
				textArea1.setText( "" );
				
				for( int i=1 ; i<=9 ; i++ ) {
					textArea1.append( "1 X " + i + " = " + i );
					textArea1.append( System.lineSeparator() );
				}
			}
		});
		panel1.add(btn1);
		
		JButton btn2 = new JButton("2단");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_2 name_336593007466800
				((CardLayout)panel2.getLayout()).show( panel2, "name_336593007466800" );
				
				textArea2.setText( "" );
				
				for( int i=1 ; i<=9 ; i++ ) {
					textArea2.append( "2 X " + i + " = " + 2*i );
					textArea2.append( System.lineSeparator() );
				}
			}
		});
		panel1.add(btn2);
		
		JButton btn3 = new JButton("3단");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_3 name_336608584611200
				((CardLayout)panel2.getLayout()).show( panel2, "name_336608584611200" );
				
				textArea3.setText( "" );
				
				for( int i=1 ; i<=9 ; i++ ) {
					textArea3.append( "3 X " + i + " = " + 3*i );
					textArea3.append( System.lineSeparator() );
				}
			}
		});
		panel1.add(btn3);
		
		panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new CardLayout(0, 0));
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel2_1, "name_336568094957400");
		panel2_1.setLayout(null);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(12, 5, 550, 270);
		textArea1.setEditable(false);
		panel2_1.add(textArea1);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel2_2, "name_336593007466800");
		panel2_2.setLayout(null);
		
		textArea2 = new JTextArea();
		textArea2.setEditable(false);
		textArea2.setBounds(12, 10, 550, 270);
		panel2_2.add(textArea2);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBackground(Color.LIGHT_GRAY);
		panel2.add(panel2_3, "name_336608584611200");
		panel2_3.setLayout(null);
		
		textArea3 = new JTextArea();
		textArea3.setEditable(false);
		textArea3.setBounds(12, 10, 550, 270);
		panel2_3.add(textArea3);
	}

}
