import java.awt.Color;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class EmpSearchEx02 extends JFrame {

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
					EmpSearchEx02 frame = new EmpSearchEx02();
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
	public EmpSearchEx02() {
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
		
		
		//spinner.setModel(new SpinnerListModel(new String[] {"\uC9C1\uCC45\uC774\uB984"}));
		spinner.setModel(new SpinnerListModel( listJob() ));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 93, 560, 658);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
	
	public String[] listJob() {
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String[] datas = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select distinct job from emp";
			pstmt = conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			
			rs.last();
			int count = rs.getRow();
			rs.beforeFirst();
			
			datas = new String[count];
			
			int idx = 0;
			while(rs.next()) {
				datas[idx++] = rs.getString("job");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		
		return datas;

	}
}
