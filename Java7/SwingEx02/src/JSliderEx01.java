import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class JSliderEx01 extends JFrame {

	private JPanel contentPane;
	private JSlider slider;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSliderEx01 frame = new JSliderEx01();
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
	public JSliderEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				System.out.println( slider.getValue() );
				textArea.append( slider.getValue() + System.lineSeparator() );
			}
		});
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setBounds(12, 10, 560, 63);
		contentPane.add(slider);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println( slider.getValue() );
			}
		});
		btn1.setBounds(12, 83, 97, 23);
		contentPane.add(btn1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 116, 560, 194);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
