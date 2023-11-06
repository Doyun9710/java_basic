import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JFrameEx03 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldStart;
	private JTextField textFieldEnd;
	private JPanel JPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx03 frame = new JFrameEx03();
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
	public JFrameEx03() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel = new JPanel();
		JPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		JPanel.setBounds(32, 23, 546, 84);
		contentPane.add(JPanel);
		JPanel.setLayout(null);
		
		JLabel lblStart = new JLabel("시작단");
		lblStart.setBounds(6, 21, 57, 15);
		JPanel.add(lblStart);
		
		JLabel lblEnd = new JLabel("끝단");
		lblEnd.setBounds(6, 60, 57, 15);
		JPanel.add(lblEnd);
		
		textFieldStart = new JTextField();
		textFieldStart.setBounds(75, 18, 350, 21);
		JPanel.add(textFieldStart);
		textFieldStart.setColumns(10);
		
		textFieldEnd = new JTextField();
		textFieldEnd.setBounds(75, 57, 350, 21);
		JPanel.add(textFieldEnd);
		textFieldEnd.setColumns(10);
		
		JButton btnPrint = new JButton("출력");
		btnPrint.setBounds(443, 17, 97, 58);
		JPanel.add(btnPrint);
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String startDan = textFieldStart.getText();
				String endDan = textFieldEnd.getText();
				
				JDialogEx03 dialog = new JDialogEx03( startDan, endDan );
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				
				// Frame 크기 / 위치
				Rectangle frameBounds = JFrameEx03.this.getBounds();

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
				
				dialog.setModal(true);

				dialog.setVisible(true);
			}
		});
	}
}
