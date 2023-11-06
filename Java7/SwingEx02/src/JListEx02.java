import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class JListEx02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblWrite;
	private JList list;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JListEx02 frame = new JListEx02();
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
	public JListEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearch = new JLabel("사원검색");
		lblSearch.setBounds(41, 52, 57, 15);
		contentPane.add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(110, 49, 340, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( textField.getText() );
				
				String strEname = textField.getText();
				list.setModel( new CustomModelEname( strEname ) );
			}
		});
		btn.setBounds(475, 48, 97, 23);
		contentPane.add(btn);
		
		lblWrite = new JLabel("사원정보");
		lblWrite.setBounds(12, 377, 560, 15);
		contentPane.add(lblWrite);
		
		list = new JList();
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if( e.getValueIsAdjusting() ) {
					return;
				}
				
				System.out.println( (String)list.getSelectedValue() );
				
				textArea.setText("");

				EmpDAO dao = new EmpDAO();
				ArrayList<EmpTO> datas = dao.listEmp( (String)list.getSelectedValue() );

				for( EmpTO to : datas ) {
					String address = String.format( "[%s] %s %s %s %s %s %s %s",
							to.getEmpno(), to.getEname(), to.getJob(), to.getMgr(), 
							to.getHiredate(), to.getSal(), to.getComm(), to.getDeptno() );
					textArea.append( address + System.lineSeparator() );
				}
			}
		});
		list.setBounds(12, 98, 560, 248);
		contentPane.add(list);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 405, 560, 24);
		contentPane.add(textArea);
	}
}
