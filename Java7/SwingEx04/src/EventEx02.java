import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class EventEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EventEx02 frame = new EventEx02();
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
	public EventEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("button 1");
//		btn1.addMouseListener( new CustomMouseEvent1() );
		btn1.addMouseListener( new CustomMouseEvent2() );
		btn1.setBounds(12, 10, 97, 23);
		btn1.setName( "button1" );
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("button 2");
//		btn2.addMouseListener( new CustomMouseEvent1() );
		btn2.addMouseListener( new CustomMouseEvent2() );
		btn2.setBounds(12, 53, 97, 23);
		btn2.setName( "button2" );
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("button 3");
//		btn3.addMouseListener( new CustomMouseEvent1() );
		btn3.addMouseListener( new CustomMouseEvent2() );
		btn3.setBounds(12, 97, 97, 23);
		btn3.setName( "button3" );
		contentPane.add(btn3);
	}

	class CustomMouseEvent1 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println( "mouseClicked(MouseEvent e)" );
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class CustomMouseEvent2 extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println( "mouseClicked(MouseEvent e)" );
			
			JButton btn = (JButton)e.getSource();
			System.out.println( btn.getText() );
			System.out.println( btn.getName() );
		}
	}
	
//	class CustomMouseEvent3 implements ActionListener {
//		private void actionperfor(ActionEvent e) {
//			JButton button = (JButton)e.getSource();
//			button.setText( "Clicked Button" );
//		}
//	}
}
