import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private Connection conn;
	
	public EmpDAO() {
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
	
	public ArrayList<String> listJob() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> datas = new ArrayList<String>();
		
		try {
			
			String sql = "select distinct job from emp";
			pstmt = this.conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			
			datas.add( "직책목록" );
			while(rs.next()) {
				datas.add(  rs.getString("job") );
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
	
	public ArrayList<String> listEmp(String job) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> datas = new ArrayList<String>();
		
		try {
			
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where job = ?";
			pstmt = this.conn.prepareStatement( sql );
			pstmt.setString( 1, job );
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				datas.add(  String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", 
						rs.getString("empno"), rs.getString("ename"), rs.getString("job"), rs.getString("mgr"),
						rs.getString("hiredate"), rs.getString("sal"), rs.getString("comm"), rs.getString("deptno") ) );
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
