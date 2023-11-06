import javax.swing.JFrame;

// has ~ 관계
public class JFrameEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JFrame
//		JFrame frame = new JFrame( "새 프레임" );
		JFrame frame = new JFrame();
		
		// 이름
		frame.setTitle( "새 프레임" );
		
		// 크기(w, h), 위치(x, y)
//		frame.setSize(600, 800);
//		frame.setLocation(100, 100);
		frame.setBounds(100, 100, 600, 800);
		
		frame.setVisible(true);
	}

}
