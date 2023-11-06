import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SampleDAO {
	// DAO : 데이터베이스 연결 클래스 ( Data Access Object )
	
	private Connection conn;
	
	// 데이터베이스 연결
	public SampleDAO() {
		
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println( "에러 " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "에러 " + e.getMessage() );
		} 
		
	}

	public ArrayList<SampleTO> searchEmp( String strDong ) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<SampleTO> datas = new ArrayList<SampleTO>();
		
		try {
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where ename like ?";
			pstmt = this.conn.prepareStatement( sql );
			pstmt.setString( 1, "%" + strDong + "%" );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				SampleTO to = new SampleTO();
				
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

}
