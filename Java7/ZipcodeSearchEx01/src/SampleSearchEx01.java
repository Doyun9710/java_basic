import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;

public class SampleSearchEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SampleSearchEx01 frame = new SampleSearchEx01();
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
	public SampleSearchEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0AC\uC6D0\uC774\uB984 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(28, 18, 529, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 18, 371, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("사원이름 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				
				textArea.setText( "" );
			
				SampleDAO dao = new SampleDAO();
				ArrayList<SampleTO> datas = dao.searchEmp(strDong);

				for( SampleTO to : datas ) {
					String address = String.format( "[%s] %s %s %s %s %s %s %s",
							to.getEmpno(), to.getEname(), to.getJob(), to.getMgr(), 
							to.getHiredate(), to.getSal(), to.getComm(), to.getDeptno() );
					textArea.append( address + System.lineSeparator() );
				}
			}
		});
		btn.setBounds(395, 17, 122, 23);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 90, 522, 641);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
