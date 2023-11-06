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

public class CardLayoutEx01 extends JFrame {

	private JPanel contentPane;
	private JPanel panel2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutEx01 frame = new CardLayoutEx01();
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
	public CardLayoutEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JButton btn1 = new JButton("첫번째");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_1 name_336568094957400
				((CardLayout)panel2.getLayout()).show( panel2, "name_336568094957400" );
			}
		});
		panel1.add(btn1);
		
		JButton btn2 = new JButton("두번째");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_2 name_336593007466800
				((CardLayout)panel2.getLayout()).show( panel2, "name_336593007466800" );
			}
		});
		panel1.add(btn2);
		
		JButton btn3 = new JButton("세번째");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// panel2_3 name_336608584611200
				((CardLayout)panel2.getLayout()).show( panel2, "name_336608584611200" );
			}
		});
		panel1.add(btn3);
		
		panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new CardLayout(0, 0));
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBackground(Color.RED);
		panel2.add(panel2_1, "name_336568094957400");
		
		JButton btnNewButton = new JButton("New button");
		panel2_1.add(btnNewButton);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBackground(Color.GREEN);
		panel2.add(panel2_2, "name_336593007466800");
		
		textField = new JTextField();
		panel2_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBackground(Color.BLUE);
		panel2.add(panel2_3, "name_336608584611200");
		
		JComboBox comboBox = new JComboBox();
		panel2_3.add(comboBox);
	}

}
