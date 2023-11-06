import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SpinnerListModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class EmpSearchEx01 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinner;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpSearchEx01 frame = new EmpSearchEx01();
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
	public EmpSearchEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC0AC\uC6D0\uD14C\uC774\uBE14 \uC870\uD68C", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(6, 5, 572, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl = new JLabel("직책");
		lbl.setBounds(12, 36, 51, 15);
		panel.add(lbl);
		
		spinner = new JSpinner();
		spinner.setBounds(75, 33, 485, 22);
		panel.add(spinner);
		spinner.setModel(new SpinnerListModel(new String[] {"\uC9C1\uCC45\uC774\uB984"}));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 93, 560, 658);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
