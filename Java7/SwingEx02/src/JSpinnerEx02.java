import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JSpinnerEx02 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx02 frame = new JSpinnerEx02();
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
	public JSpinnerEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("직책");
		lbl.setBounds(12, 10, 57, 15);
		contentPane.add(lbl);
		
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// Emp List Update
				String strJob = (String)spinner.getValue();
				
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
//		spinner.setModel(new SpinnerListModel(new String[] {"\uC9C1\uCC45\uC774\uB984", "CLERK", "SALESMAN", "MANAGER", "ANALYST", "PRESIDENT"}));
		spinner.setModel(new SpinnerListModel( setSpinnerList() ));
		spinner.setBounds(138, 7, 434, 22);
		contentPane.add(spinner);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 54, 560, 299);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	private String[] setSpinnerList() {

		JSpinnerEx02_DAO dao = new JSpinnerEx02_DAO();
		ArrayList<JSpinnerEx02_TO> datas = dao.searchJob();

		String[] array = new String[datas.size()];

		int size=0;
		for(JSpinnerEx02_TO temp : datas)
		  array[size++] = temp.getJob();

		return array;
	}
}
