import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOptionPaneEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneEx01 frame = new JOptionPaneEx01();
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
	public JOptionPaneEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				JOptionPane.showMessageDialog( JOptionPaneEx01.this, "메시지" );
				JOptionPane.showMessageDialog( JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.WARNING_MESSAGE);
			}
		});
		btn1.setBounds(12, 10, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("New button");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				JOptionPane.showConfirmDialog( JOptionPaneEx01.this, "메시지");
//				JOptionPane.showConfirmDialog( JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.OK_CANCEL_OPTION);
//				JOptionPane.showConfirmDialog( JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.YES_NO_OPTION);
				
				int result = JOptionPane.showConfirmDialog( JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.OK_CANCEL_OPTION);
				if( result == JOptionPane.OK_OPTION ) {
					System.out.println( "OK_OPTION" );
				} else if( result == JOptionPane.CANCEL_OPTION ) {
					System.out.println( "CANCEL_OPTION" );
				} else if( result == JOptionPane.CLOSED_OPTION ) {
					System.out.println( "CLOSED_OPTION" );
				} else {
					System.out.println( "기타" );
				}
			}
		});
		btn2.setBounds(12, 43, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("New button");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				JOptionPane.showInputDialog( "메세지" );
				String msg = JOptionPane.showInputDialog( "메시지", "내용" );
//				System.out.println( "메시지 : " + msg );
				
				if( msg != null ) {
					System.out.println( msg );
				} else {
					System.out.println( "취소 클릭" );
				}
			}
		});
		btn3.setBounds(12, 76, 97, 23);
		contentPane.add(btn3);
	}

}
