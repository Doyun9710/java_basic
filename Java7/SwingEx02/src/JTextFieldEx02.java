import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class JTextFieldEx02 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JLabel lbl1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTextFieldEx02 frame = new JTextFieldEx02();
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
	public JTextFieldEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uB300\uBB38\uC790 \uBCC0\uD658", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(20, 20, 240, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(6, 17, 217, 32);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JButton btn1 = new JButton("변환");
		btn1.setBounds(66, 73, 97, 23);
		panel.add(btn1);
		
		lbl1 = new JLabel("");
		lbl1.setBounds(6, 119, 217, 32);
		panel.add(lbl1);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 대문자 변환
//				String[] names = tf1.getText().split(" ");
//				String result = "";
				
				// 방법 1
//				for( String name : names )
//					result += name.substring(0, 1).toUpperCase() + name.substring(1) + " ";
				
				// 방법 2
//				for( int i=0 ; i<names.length ; i++ )
//					names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1) + " ";
//				result = String.join( " ", names);
//				lbl1.setText( result );

				// 방법 3
				lbl1.setText( CapitalizeName( tf1.getText() ) );
			}
		});
	}
	
	public String CapitalizeName(String name) {
		String[] names = name.split(" ");
		String result = "";

//		for( String name : names )
//			result += name.substring(0, 1).toUpperCase() + name.substring(1) + " ";

		for( int i=0 ; i<names.length ; i++ )
			names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1) + " ";

		return String.join( " ", names);
	}

}
