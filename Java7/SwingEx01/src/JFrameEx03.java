import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameEx03 extends JFrame {
	private JPanel contentPane;
	
	public JFrameEx03() {
		
		this.setBounds(100, 100, 600, 800);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// widget 배치용 영역
		contentPane = new JPanel();
		
		// 사용되는 모든 내용은 객체
		contentPane.setBackground( Color.GREEN );
		
		// 버튼
		JButton btn1 = new JButton( "버튼 1" );
		contentPane.add( btn1 );
		
		JButton btn2 = new JButton( "버튼 2" );
		contentPane.add( btn2 );
		
		this.setContentPane(contentPane);
	}
	
	public static void main(String[] args) {
		
		JFrameEx03 frame = new JFrameEx03();
		frame.setVisible(true);
	}
}
