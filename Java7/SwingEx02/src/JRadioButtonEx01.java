import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JRadioButtonEx01 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtn1;
	private JRadioButton rdbtn2;
	private JRadioButton rdbtn3;
	private JRadioButton rdbtn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonEx01 frame = new JRadioButtonEx01();
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
	public JRadioButtonEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtn1 = new JRadioButton("사과");
		rdbtn1.setSelected(true);
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(8, 32, 121, 23);
		contentPane.add(rdbtn1);
		
		rdbtn2 = new JRadioButton("수박");
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(8, 57, 121, 23);
		contentPane.add(rdbtn2);
		
		rdbtn3 = new JRadioButton("참외");
		buttonGroup.add(rdbtn3);
		rdbtn3.setBounds(8, 82, 121, 23);
		contentPane.add(rdbtn3);
		
		rdbtn4 = new JRadioButton("딸기");
		buttonGroup.add(rdbtn4);
		rdbtn4.setBounds(8, 107, 121, 23);
		contentPane.add(rdbtn4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( rdbtn1.isSelected() ) {
					System.out.println( "rdbtn1 선택" );
				} else if( rdbtn2.isSelected() ) {
					System.out.println( "rdbtn2 선택" );
				} else if( rdbtn3.isSelected() ) {
					System.out.println( "rdbtn3 선택" );
				} else {
					System.out.println( "rdbtn4 선택" );
				}
			}
		});
		btnNewButton.setBounds(12, 136, 97, 23);
		contentPane.add(btnNewButton);
	}
}
