import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZipcodeSearchEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchEx01 frame = new ZipcodeSearchEx01();
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
	public ZipcodeSearchEx01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(28, 18, 529, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 18, 371, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("우편번호 검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				
				textArea.setText( "" );
				
				String url = "jdbc:mariadb://localhost:3306/project";
				String user = "project";
				String password = "123456";
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					Class.forName( "org.mariadb.jdbc.Driver" );
					
					conn = DriverManager.getConnection(url, user, password);
					
					String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
					pstmt = conn.prepareStatement( sql );
					pstmt.setString( 1, strDong + "%" );
					
					rs = pstmt.executeQuery();
					
					while( rs.next() ) {
//						System.out.println( rs.getString( "zipcode" ) );
						
						String zipcode = rs.getString( "zipcode" );
						String sido = rs.getString( "sido" );
						String gugun = rs.getString( "gugun" );
						String dong = rs.getString( "dong" );
						String ri = rs.getString( "ri" );
						String bunji = rs.getString( "bunji" );
						
						String address = String.format( "[%s] %s %s %s %s %s", 
								zipcode, sido, gugun, dong, ri, bunji );
						
						System.out.println( address );
						textArea.append( address + System.lineSeparator() );
					}
				} catch (ClassNotFoundException e1) {
					System.out.println( "에러 " + e1.getMessage() );
				} catch (SQLException e1) {
					System.out.println( "에러 " + e1.getMessage() );
				} finally {
					if( rs != null ) try { rs.close(); } catch(SQLException e1) {}
					if( pstmt != null ) try { pstmt.close(); } catch(SQLException e1) {}
					if( conn != null ) try { conn.close(); } catch(SQLException e1) {}
				}
			}
		});
		btn.setBounds(395, 17, 122, 23);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 90, 522, 641);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
