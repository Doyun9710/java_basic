import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JFileChooserEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx01 frame = new JFileChooserEx01();
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
	public JFileChooserEx01() {
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
				JFileChooser fileChooser = new JFileChooser( "c:\\Java\\java-workspace" );
				
				// 이름 필터
				FileNameExtensionFilter filter = new FileNameExtensionFilter( "Java Source", "java" );
				fileChooser.setFileFilter( filter );
				
				int result = fileChooser.showOpenDialog( JFileChooserEx01.this );
				
				if( result == JFileChooser.APPROVE_OPTION ) {
					System.out.println( "확인" );
					
					// 파일 이름, 위치
					System.out.println( fileChooser.getSelectedFile().getName() );
					System.out.println( fileChooser.getSelectedFile().getAbsolutePath() );
					
					// 파일 내용 읽기 => I/O
					BufferedReader br = null;

					try {
						br = new BufferedReader( new FileReader( fileChooser.getSelectedFile().getAbsolutePath() ) );

						String data = null;
						while( ( data = br.readLine() ) != null) {
							System.out.println( data );
						}
					} catch (FileNotFoundException e1) {
						System.out.println( "[에러]" + e1.getMessage() );
					} catch (IOException e1) {
						System.out.println( "[에러]" + e1.getMessage() );
					} finally {
						if( br != null ) try { br.close(); } catch(IOException e1) {}
					}
				} else if( result == JFileChooser.CANCEL_OPTION ) {
					System.out.println( "취소" );
				} else {
					System.out.println( "기타" );
				}
			}
		});
		btn.setBounds(12, 10, 97, 23);
		contentPane.add(btn);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser( "c:\\Java\\java-workspace" );
				fileChooser.showSaveDialog( JFileChooserEx01.this );
			}
		});
		btnNewButton.setBounds(12, 43, 97, 23);
		contentPane.add(btnNewButton);
	}

}
