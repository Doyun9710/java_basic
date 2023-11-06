import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class JTextAreaEx02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextAreaEx02 frame = new JTextAreaEx02();
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
	public JTextAreaEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(21, 32, 557, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("단수입력 : ");
		lbl1.setBounds(6, 21, 69, 15);
		panel.add(lbl1);
		
		textField1 = new JTextField();
		textField1.setBounds(73, 18, 354, 21);
		panel.add(textField1);
		textField1.setColumns(10);
		
		JButton btn1 = new JButton("구구단 출력");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// overwrite - 기존에 있는 내용을 지우고 새로게 셋팅
//				textArea.setText( textField1.getText() );
				
				// append - 기존 내용을 유지한채 뒤에 붙힘
//				textArea.append( textField1.getText() );
				
				Gugudan( Integer.parseInt(textField1.getText() ) );
			}
		});
		btn1.setBounds(439, 17, 112, 23);
		panel.add(btn1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 88, 547, 340);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
	
	public void Gugudan( int dan ) {
		
		// textArea 초기화
		textArea.setText("");
		for( int i=1 ; i<=9 ; i++ ) {
			textArea.append( dan + " X " + i + " = " + dan*i );
			textArea.append( System.lineSeparator() );
		}
	}

}
