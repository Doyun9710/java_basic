import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JComboBoxEx01 extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxEx01 frame = new JComboBoxEx01();
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
	public JComboBoxEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					System.out.println( (String)comboBox.getSelectedItem() );
				}
			}
		});
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"사과", "참외", "수박", "딸기"}));
//		comboBox.setModel( new CustomComboBoxModel1() );
		comboBox.setModel( new CustomComboBoxModel2() );
		comboBox.setSelectedIndex( 0 );
		comboBox.setBounds(12, 10, 205, 35);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( comboBox.getSelectedIndex() );
				System.out.println( (String)comboBox.getSelectedItem() );
			}
		});
		btnNewButton.setBounds(12, 55, 97, 23);
		contentPane.add(btnNewButton);
	}
}
