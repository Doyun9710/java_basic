import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class JTableEx02 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableEx02 frame = new JTableEx02();
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
	public JTableEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("시작단");
		lblNewLabel.setBounds(29, 35, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("끝단");
		lblNewLabel_1.setBounds(29, 73, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JSpinner spinnerStart = new JSpinner();
		spinnerStart.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinnerStart.setBounds(110, 32, 317, 22);
		contentPane.add(spinnerStart);
		
		JSpinner spinnerEnd = new JSpinner();
		spinnerEnd.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		spinnerEnd.setBounds(110, 70, 317, 22);
		contentPane.add(spinnerEnd);
		
		JButton btnStart = new JButton("구구단 출력");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int startDan = (int)spinnerStart.getValue();
				int endDan = (int)spinnerEnd.getValue();
				
				System.out.println( startDan );
				System.out.println( endDan );
				
				if( startDan <= endDan )
					table.setModel( new JTableEx02_CustomTableModel( startDan, endDan ) );
			}
		});
		btnStart.setBounds(448, 31, 107, 57);
		contentPane.add(btnStart);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 128, 526, 311);
		contentPane.add(scrollPane);
		
		table = new JTable();
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//				{null, null, null, null, null, null, null, null, null, null},
//			},
//			new String[] {
//				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
//			}
//		));
//		table.setModel( new JTableEx02_CustomTableModel( 1, 2 ) );
		scrollPane.setViewportView(table);
	}
}
