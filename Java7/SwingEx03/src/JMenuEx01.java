import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;

public class JMenuEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuEx01 frame = new JMenuEx01();
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
	public JMenuEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mn1 = new JMenu("파일");
		menuBar.add(mn1);
		
		JMenuItem mntm1 = new JMenuItem("열기");
		mntm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println( "열기 클릭" );
			}
		});
		mn1.add(mntm1);
		
		// 구분선
		mn1.addSeparator();
		
		JMenuItem mntm2 = new JMenuItem("저장");
		mn1.add(mntm2);
		
		JMenuItem mntm3 = new JMenuItem("다른이름으로 저장");
		mn1.add(mntm3);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("사과");
		chckbxmntmNewCheckItem.setSelected(true);
		mn1.add(chckbxmntmNewCheckItem);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_1 = new JCheckBoxMenuItem("수박");
		mn1.add(chckbxmntmNewCheckItem_1);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem_2 = new JCheckBoxMenuItem("참외");
		mn1.add(chckbxmntmNewCheckItem_2);
		
		JMenu mnNewMenu = new JMenu("홈");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
