import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JFrameEx02 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx02 frame = new JFrameEx02();
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
	public JFrameEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		lbl1 = new JLabel("난 라벨 1\n난 라벨 1\n난 라벨 1\n");
		lbl1 = new JLabel("<html><body><font color='red'>라벨1<br />라벨2</body></html>");
		lbl1.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl1.setBounds(50, 45, 373, 101);
		
		System.out.println( lbl1.getText() );
		
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setIcon(new ImageIcon("C:\\Java\\java-workspace\\SwingEx02\\icon.jpg"));
		lbl2.setBounds(50, 185, 214, 101);
		contentPane.add(lbl2);
	}
}
