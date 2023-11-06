import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GugudanMainUI01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GugudanMainUI01 frame = new GugudanMainUI01();
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
	public GugudanMainUI01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uAD6C\uAD6C\uB2E8", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 18, 566, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(81, 29, 346, 21);
		panel.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(81, 60, 346, 21);
		panel.add(textField2);
		textField2.setColumns(10);
		
		JButton btn = new JButton("출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String startDan = textField1.getText();
				String endDan = textField2.getText();
				
				GugudanUI01 gugudan = new GugudanUI01(startDan, endDan);
				gugudan.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				gugudan.setModal(true);
				gugudan.setResizable(false);
				gugudan.setVisible(true);
			}
		});
		btn.setBounds(439, 28, 115, 53);
		panel.add(btn);
		
		JLabel lbl1 = new JLabel("시작단");
		lbl1.setBounds(12, 32, 57, 15);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("끝단");
		lbl2.setBounds(12, 63, 57, 15);
		panel.add(lbl2);
	}
}
