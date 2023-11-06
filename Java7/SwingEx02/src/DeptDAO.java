import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO {
	private Connection conn;
	
	public DeptDAO() {
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		}
	}
	
	public ArrayList<DeptTO> listDept() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<DeptTO> datas = new ArrayList<DeptTO>();
		
		try {
			String sql = "select distinct deptno, dname, loc from dept";
			pstmt = this.conn.prepareStatement( sql );
//			pstmt.setString( 1, dept );
			
			rs = pstmt.executeQuery();

			while(rs.next()) {
				DeptTO to = new DeptTO();
				
				to.setDeptno( rs.getString( "deptno" ) );
				to.setDname( rs.getString( "dname" ) );
				to.setLoc( rs.getString( "loc" ) );
				
				datas.add( to );
			}
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		
		return datas;
	}
}
