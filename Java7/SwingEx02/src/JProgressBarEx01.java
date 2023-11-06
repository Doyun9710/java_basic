import java.awt.EventQueue;
import java.awt.color.ICC_ProfileGray;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarEx01 extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JButton btn2;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarEx01 frame = new JProgressBarEx01();
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
	public JProgressBarEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(50);
		progressBar.setBounds(12, 10, 560, 30);
		contentPane.add(progressBar);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( progressBar.getValue() );
//				progressBar.setValue( 75 );
			}
		});
		btn1.setBounds(12, 50, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("감소(-10)");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue( progressBar.getValue() - 10 );
				if( progressBar.getValue() == 0 ) {
					System.out.println( "진행률 0% !!!" );
					JOptionPane.showMessageDialog( JProgressBarEx01.this, "진행률 0% !!!", "타이틀", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn2.setBounds(12, 83, 97, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("증가(+10)");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue( progressBar.getValue() + 10 );
				if( progressBar.getValue() == 100 ) {
					System.out.println( "진행률 100% !!!" );
					JOptionPane.showMessageDialog( JProgressBarEx01.this, "진행률 100% !!!", "타이틀", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn3.setBounds(121, 83, 97, 23);
		contentPane.add(btn3);
	}
}
