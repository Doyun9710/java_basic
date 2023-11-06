import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JFrameEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx01 frame = new JFrameEx01();
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
	public JFrameEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("New button");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JDialogEx01 dialog = new JDialogEx01();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				
				System.out.println( "1" );
				
				// Frame 크기 / 위치
				Rectangle frameBounds = JFrameEx01.this.getBounds();

				int fx = (int)frameBounds.getX();
				int fy = (int)frameBounds.getY();
				int fwidth = (int)frameBounds.getWidth();
				int fheight = (int)frameBounds.getHeight();
				
				// Dialog의 크기
				int dwidth = 450;
				int dheight = 300;
				
				// Dialog 크기 / 위치
				dialog.setBounds( fwidth/2 - dwidth/2 + fx, 
								fheight/2 - dheight/2 + fy,
								dwidth, 
								dheight );
				
				// 제어권 이전, 추가 생성 방지
				dialog.setModal(true);
				
				System.out.println( "2" );
				
				// JFrame 중지
				dialog.setVisible(true);
				
				// JDialog close 시 실행
				System.out.println( "3" );
			}
		});
		btn.setBounds(12, 10, 97, 23);
		contentPane.add(btn);
	}
}
