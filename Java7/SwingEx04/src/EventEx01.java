import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class EventEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx01 frame = new EventEx01();
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
	public EventEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("New button");
		btn.setBounds(12, 10, 97, 23);
		// Click -> MouseListener
		btn.addMouseListener( new MouseListener() {
			
			// 핸들러
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println( "mouseReleased(MouseEvent e)" );
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println( "mousePressed(MouseEvent e)" );
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println( "mouseExited(MouseEvent e)" );
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println( "mouseEntered(MouseEvent e)" );
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( "mouseClicked(MouseEvent e)" );
			}
		});
		contentPane.add(btn);
		
		JButton btn2 = new JButton("New button");
		btn2.setBounds(12, 43, 196, 120);
		btn2.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( "mouseClicked(MouseEvent e)" );
				
				// 클릭한 위치
				System.out.println( e.getX() );
				System.out.println( e.getY() );
				
				// 짧은 시간 내 클릭 횟수 (자동 초기화)
				System.out.println( e.getClickCount() );
				
				// 이벤트 발생 소스(코드)
				System.out.println( e.getSource() );
				
				// 버튼 이름
				JButton btn = (JButton)e.getSource();
				System.out.println( btn.getText() );
			}
		});
		contentPane.add(btn2);
	}

}
