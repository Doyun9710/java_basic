import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class JFileChooserEx02 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFileChooserEx02 frame = new JFileChooserEx02();
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
	public JFileChooserEx02() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uD30C\uC77C \uAD00\uB9AC", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(37, 25, 311, 46);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnOpen = new JButton("자바 파일 열기");
		btnOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser( "c:\\Java\\java-workspace\\SwingEx03\\src" );
				
				// 이름 필터
				FileNameExtensionFilter filter = new FileNameExtensionFilter( "Java Source", "java" );
				fileChooser.setFileFilter( filter );
				
				int result = fileChooser.showOpenDialog( JFileChooserEx02.this );
				
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
						textArea.setText("");
						while( ( data = br.readLine() ) != null) {
//							System.out.println( data );
							textArea.append( data );
							textArea.append( System.lineSeparator() );
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
		btnOpen.setBounds(6, 17, 131, 23);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("자바 파일 저장");
		btnSave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser( "c:\\Java" );
				int result = fileChooser.showSaveDialog( JFileChooserEx02.this );
				
				BufferedWriter bw = null;
				
				try {
//					bw = new BufferedWriter( new FileWriter( "c:\\Java\\ex01.java" ) );
//					bw = new BufferedWriter( new FileWriter( fileChooser.getSelectedFile().toString() + "." + fileChooser.getFileFilter().getDescription() ) );
					bw = new BufferedWriter( new FileWriter( fileChooser.getSelectedFile().toString() + ".java" ) );

					// JtextArea 컴퍼넌트의 모든 문자열을 반환받아 저장
					String text = textArea.getText(); // getText() : 모든 문자열을(엔터포함) 다 읽어 들일 수 있음

					// 파일 출력스트림으로 문자열을 전달하여 저장
					bw.write(text);

					bw.close();
					
					System.out.println( "저장 완료" );
				} catch (FileNotFoundException e1) {
					System.out.println( "[에러]" + e1.getMessage() );
				} catch (IOException e1) {
					System.out.println( "[에러]" + e1.getMessage() );
				} finally {
					if( bw != null ) try { bw.close(); } catch(IOException e1) {}
				}
				
				// 방법 2
//				DataOutputStream dos = null;
//				
//				try {
//					// binary
//					dos = new DataOutputStream( new FileOutputStream( "./ex02.java" ) );
//
//					dos.writeUTF( textArea.getText() );
//					
//					System.out.println( "저장 완료" );
//				} catch (FileNotFoundException e1) {
//					System.out.println( "[에러]" + e1.getMessage() );
//				} catch (IOException e1) {
//					System.out.println( "[에러]" + e1.getMessage() );
//				} finally {
//					if( dos != null ) try { dos.close(); } catch(IOException e1) {}
//				}
			}
		});
		btnSave.setBounds(174, 17, 131, 23);
		panel.add(btnSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(37, 81, 535, 670);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
