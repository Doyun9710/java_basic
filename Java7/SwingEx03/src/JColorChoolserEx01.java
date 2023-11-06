import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class JColorChoolserEx01 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JColorChoolserEx01 frame = new JColorChoolserEx01();
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
	public JColorChoolserEx01() {
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
				Color defaultColor = lbl.getForeground();
//				Color color = JColorChooser.showDialog( JColorChoolserEx01.this, "팔레트", Color.RED);
				Color color = JColorChooser.showDialog( JColorChoolserEx01.this, "팔레트", defaultColor);
				
				if( color != null ) {
					System.out.println( color.toString() );
					System.out.println( color.getRed() );
					System.out.println( color.getGreen() );
					System.out.println( color.getBlue() );
				} else {
					System.out.println( "취소" );
				}
//				try {
//					System.out.println( color.toString() );
//				} catch (NullPointerException e1) {
//					System.out.println( "취소 버튼 클릭");
//				}
				
				lbl.setForeground( color );
			}
		});
		btn.setBounds(12, 10, 97, 23);
		contentPane.add(btn);
		
		lbl = new JLabel("글자색 바꾸기");
		lbl.setForeground(Color.MAGENTA);
		lbl.setBounds(12, 43, 277, 31);
		contentPane.add(lbl);
	}

}
