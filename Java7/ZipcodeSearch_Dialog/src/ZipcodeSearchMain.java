import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ZipcodeSearchMain extends JFrame {

	private JPanel contentPane;
	private JTextArea textAreaNumber;
	private JTextArea textArea1;
	private JTextArea textArea2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchMain frame = new ZipcodeSearchMain();
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
	public ZipcodeSearchMain() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAreaNumber = new JTextArea();
		textAreaNumber.setBounds(47, 49, 162, 24);
		contentPane.add(textAreaNumber);
		
		textArea1 = new JTextArea();
		textArea1.setBounds(47, 93, 487, 24);
		contentPane.add(textArea1);
		
		textArea2 = new JTextArea();
		textArea2.setBounds(47, 137, 487, 24);
		contentPane.add(textArea2);
		
		JButton btn = new JButton("우편번호 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ZipcodeSearchDialog dialog = new ZipcodeSearchDialog();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

				// Frame 크기 / 위치
				Rectangle frameBounds = ZipcodeSearchMain.this.getBounds();

				int fx = (int)frameBounds.getX();
				int fy = (int)frameBounds.getY();
				int fwidth = (int)frameBounds.getWidth();
				int fheight = (int)frameBounds.getHeight();
				
				// Dialog의 크기
				int dwidth = 450;
				int dheight = 600;
				
				// Dialog 크기 / 위치
				dialog.setBounds( fwidth/2 - dwidth/2 + fx, 
								fheight/2 - dheight/2 + fy,
								dwidth, 
								dheight );
				
				// 제어권 이전, 추가 생성 방지
				dialog.setModal(true);

				// JFrame 중지
				dialog.setVisible(true);
				
//				System.out.println( "Main : " + dialog.getZipcode() );
				String sigudongri = dialog.getSido() + dialog.getGugun() + dialog.getDong() + dialog.getRi();
				String bunseq = dialog.getBunji() + dialog.getSeq();
				textAreaNumber.setText( dialog.getZipcode() );
				textArea1.setText( sigudongri.replaceAll( "null", "\t" ) );
				textArea2.setText( bunseq.replaceAll( "null", "\t" ) );
			}
		});
		btn.setBounds(235, 50, 123, 23);
		contentPane.add(btn);
	}

}
