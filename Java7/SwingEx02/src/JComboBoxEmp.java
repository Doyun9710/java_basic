import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;

public class JComboBoxEmp extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBoxEmp frame = new JComboBoxEmp();
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
	public JComboBoxEmp() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// Emp List Update
				String strJob = (String)comboBox.getSelectedItem();
				
				textArea.setText( "" );
			
				JSpinnerEx02_DAO dao = new JSpinnerEx02_DAO();
				ArrayList<JSpinnerEx02_TO> datas = dao.searchEmp(strJob);

				for( JSpinnerEx02_TO to : datas ) {
					String address = String.format( "[%s] %s %s %s %s %s %s %s",
							to.getEmpno(), to.getEname(), to.getJob(), to.getMgr(), 
							to.getHiredate(), to.getSal(), to.getComm(), to.getDeptno() );
					textArea.append( address + System.lineSeparator() );
				}
			}
		});
		comboBox.setModel( new CustomComboBoxEmpModel() );
		comboBox.setBounds(12, 10, 194, 53);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 89, 560, 201);
		contentPane.add(textArea);
	}

}
