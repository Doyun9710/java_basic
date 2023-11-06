import javax.swing.JFrame;

public class JFrameEx02 extends JFrame {
	
	public JFrameEx02() {
		this.setTitle( "새 프레임" );
		this.setBounds(100, 100, 600, 800);
		
		// x버튼 클릭 시 프로그램 종료
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	public static void main(String[] args) {
		JFrameEx02 frame = new JFrameEx02();
		
//		frame.setBounds(100, 100, 600, 800);
		
		frame.setVisible(true);
	}
}
