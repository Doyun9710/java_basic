import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class JSpinnerEx01 extends JFrame {

	private JPanel contentPane;
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSpinnerEx01 frame = new JSpinnerEx01();
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
	public JSpinnerEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		spinner1 = new JSpinner();
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println( spinner1.getValue() );
			}
		});
//		spinner1.setModel(new SpinnerNumberModel(50, 0, 100, 10));
		SpinnerNumberModel spinnerNumberModel1 = new SpinnerNumberModel(50, 0, 100, 10);
		spinner1.setModel( spinnerNumberModel1 );
		spinner1.setBounds(12, 10, 85, 55);
		contentPane.add(spinner1);
		
		spinner2 = new JSpinner();
//		spinner2.setModel(new SpinnerListModel(new String[] {"\uC0AC\uACFC", "\uCC38\uC678", "\uC218\uBC15", "\uB538\uAE30", "\uC790\uB450"}));
		spinner2.setBounds(12, 88, 85, 64);
		contentPane.add(spinner2);
		
		spinner3 = new JSpinner();
		spinner3.setModel(new SpinnerDateModel(new Date(1694617200000L), new Date(1691938800000L), new Date(1702479600000L), Calendar.DAY_OF_YEAR));
		spinner3.setBounds(12, 175, 193, 64);
		contentPane.add(spinner3);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 데이터 가져오기
				System.out.println( (Integer)spinner1.getValue() );
				System.out.println( (String)spinner2.getValue() );
			}
		});
		btn1.setBounds(12, 260, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("New button");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				spinner2.setModel(new SpinnerListModel(new String[] {"\uC0AC\uACFC", "\uCC38\uC678", "\uC218\uBC15", "\uB538\uAE30", "\uC790\uB450"}));
			}
		});
		btn2.setBounds(12, 293, 97, 23);
		contentPane.add(btn2);
	}
}
