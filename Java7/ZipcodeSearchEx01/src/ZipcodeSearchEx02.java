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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeSearchEx02 extends JFrame {

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
					ZipcodeSearchEx02 frame = new ZipcodeSearchEx02();
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
	public ZipcodeSearchEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(28, 18, 529, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 18, 371, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("우편번호 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				
				textArea.setText( "" );

//				ArrayList<String> datas = dao.searchZipcode(strDong);				
				ZipcodeDAO dao = new ZipcodeDAO();
				ArrayList<ZipcodeTO> datas = dao.searchZipcode(strDong);
				
//				for( String data : datas ) {
//					textArea.append( data + System.lineSeparator() );
//				}
				for( ZipcodeTO to : datas ) {
					String address = String.format( "[%s] %s %s %s %s %s",
							to.getZipcode(), to.getSido(), to.getGugun(), to.getDong(), to.getRi(), to.getBunji() );
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
