import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JTextField;

public class ImageViewerEx01 extends JFrame {

	private JPanel contentPane;
	private JButton btn2;
	private JTextField txtHttp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageViewerEx01 frame = new ImageViewerEx01();
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
	public ImageViewerEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("이미지 저장");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				btn2.setIcon(new ImageIcon("C:\\Java\\java-workspace\\NetworkEx01\\daum.png"));
				try {
					btn2.setIcon(new ImageIcon(new URL( "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png" )));
				} catch (MalformedURLException e1) {
					System.out.println( "[에러] " + e1.getMessage() );
				} 
			}
		});
		btn1.setBounds(449, 10, 123, 23);
		contentPane.add(btn1);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(12, 43, 560, 393);
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		btn2 = new JButton("");
//		btn2.setIcon(new ImageIcon("C:\\Java\\java-workspace\\NetworkEx01\\daum.png"));
		panel2.add(btn2, BorderLayout.CENTER);
		
		txtHttp = new JTextField();
		txtHttp.setText("http://");
		txtHttp.setBounds(12, 11, 425, 21);
		contentPane.add(txtHttp);
		txtHttp.setColumns(10);
	}
}
