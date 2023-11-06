import java.awt.Color;
import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx04 extends JFrame {
	private JPanel contentPane;
	
	public JFrameEx04() {
		
		this.setBounds(100, 100, 600, 800);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// widget 배치용 영역
		contentPane = new JPanel();
		
		// 사용되는 모든 내용은 객체
		contentPane.setBackground( Color.GREEN );
		
		// LayoutManager => Absolute Layout
		contentPane.setLayout( null );
		
		// 버튼
		JButton btn1 = new JButton( "버튼 1" );
		btn1.setBounds(100, 10, 100, 25);
		contentPane.add( btn1 );
		
		JButton btn2 = new JButton( "버튼 2" );
		btn2.setBounds(100, 50, 100, 25);
		contentPane.add( btn2 );
		
		// 이벤트 - 마우스 클릭
		btn1.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( "마우스 클릭" );
			}
		});
		
		this.setContentPane(contentPane);
	}
	
	public static void main(String[] args) {
		
		JFrameEx04 frame = new JFrameEx04();
		frame.setVisible(true);
	}
}
