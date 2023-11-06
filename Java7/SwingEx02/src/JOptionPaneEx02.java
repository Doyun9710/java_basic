import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOptionPaneEx02 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneEx02 frame = new JOptionPaneEx02();
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
	public JOptionPaneEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("구구단 입력");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String msg = JOptionPane.showInputDialog( "메시지", "내용" );
				
				if( msg != null ) {
					try {
						int dan = Integer.parseInt(msg);
						
						Gugudan( dan );
					} catch (NumberFormatException e1) {
						System.out.println( "숫자를 입력해주세요" );
					}
				} else {
					System.out.println( "취소 클릭" );
				}
			}
		});
		btn1.setBounds(12, 10, 560, 23);
		contentPane.add(btn1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 52, 560, 411);
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
