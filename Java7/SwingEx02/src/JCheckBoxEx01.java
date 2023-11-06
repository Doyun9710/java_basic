import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JCheckBoxEx01 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbx1;
	private JCheckBox chckbx2;
	private JCheckBox chckbx3;
	private JCheckBox chckbx4;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxEx01 frame = new JCheckBoxEx01();
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
	public JCheckBoxEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbx1 = new JCheckBox("사과");
		chckbx1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( chckbx1.isSelected() ) {
					System.out.println( "선택" );
				} else {
					System.out.println( "해제" );
				}
			}
		});
		chckbx1.setSelected(true);
		chckbx1.setBounds(8, 46, 115, 23);
		contentPane.add(chckbx1);
		
		chckbx2 = new JCheckBox("수박");
		chckbx2.setBounds(8, 71, 115, 23);
		contentPane.add(chckbx2);
		
		chckbx3 = new JCheckBox("참외");
		chckbx3.setBounds(8, 96, 115, 23);
		contentPane.add(chckbx3);
		
		chckbx4 = new JCheckBox("딸기");
		chckbx4.setBounds(8, 121, 115, 23);
		contentPane.add(chckbx4);
		
		JButton btn1 = new JButton("New button");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( chckbx1.isSelected() ) {
					System.out.println( "bx1 선택 : " + chckbx1.getText() );
				}
				if( chckbx2.isSelected() ) {
					System.out.println( "bx2 선택 : " + chckbx2.getText() );
				}
				if( chckbx3.isSelected() ) {
					System.out.println( "bx3 선택 : " + chckbx3.getText() );
				}
				if( chckbx4.isSelected() ) {
					System.out.println( "bx4 선택 : " + chckbx4.getText() );
				}
			}
		});
		btn1.setBounds(8, 150, 97, 23);
		contentPane.add(btn1);
		
		btn2 = new JButton("전체선택");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbx1.setSelected(true);
				chckbx2.setSelected(true);
				chckbx3.setSelected(true);
				chckbx4.setSelected(true);
			}
		});
		btn2.setBounds(8, 183, 97, 23);
		contentPane.add(btn2);
		
		btn3 = new JButton("전체해제");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chckbx1.setSelected(false);
				chckbx2.setSelected(false);
				chckbx3.setSelected(false);
				chckbx4.setSelected(false);
			}
		});
		btn3.setBounds(125, 183, 97, 23);
		contentPane.add(btn3);
		
		btn4 = new JButton("전체선택");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if( btn4.getText().equals("전체선택") ) {
					btn4.setText( "전체삭제" );
					chckbx1.setSelected(true);
					chckbx2.setSelected(true);
					chckbx3.setSelected(true);
					chckbx4.setSelected(true);
				} else {
					btn4.setText( "전체선택" );
					chckbx1.setSelected(false);
					chckbx2.setSelected(false);
					chckbx3.setSelected(false);
					chckbx4.setSelected(false);
				}
			}
		});
		btn4.setBounds(8, 216, 97, 23);
		contentPane.add(btn4);
	}
}
