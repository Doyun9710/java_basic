import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomComboBoxEmpDAO {
	private Connection conn;
	
	public CustomComboBoxEmpDAO() {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";

		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}
	}
	
public ArrayList<CustomComboBoxEmpTO> searchEmp( String strDong ) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<CustomComboBoxEmpTO> datas = new ArrayList<CustomComboBoxEmpTO>();
		
		try {
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where job like ?";
			pstmt = this.conn.prepareStatement( sql );
//			pstmt.setString( 1, "%" + strDong + "%" );
			pstmt.setString( 1, strDong );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				CustomComboBoxEmpTO to = new CustomComboBoxEmpTO();
				
				to.setEmpno( rs.getString( "empno" ) );
				to.setEname( rs.getString( "ename" ) );
				to.setJob( rs.getString( "job" ) );
				to.setMgr( rs.getString( "mgr" ) );
				to.setHiredate( rs.getString( "hiredate" ) );
				to.setSal( rs.getString( "sal" ) );
				to.setComm( rs.getString( "comm" ) );
				to.setDeptno( rs.getString( "deptno" ) );
				
				datas.add( to );
			}
		} catch (SQLException e) {
			System.out.println( "에러 " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		
		return datas;
	}
	
	public String[] listJob() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String[] datas = null;
		
		try {
			
			String sql = "select distinct job from emp";
			pstmt = this.conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			
			rs.last();
			int count = rs.getRow();
			rs.beforeFirst();
			
			datas = new String[count];
			
			int idx = 0;
			while(rs.next()) {
				datas[idx++] = rs.getString("job");
			}
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
