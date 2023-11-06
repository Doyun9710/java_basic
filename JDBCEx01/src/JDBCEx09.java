import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
			stmt = conn.createStatement();
			
			String sql = "select empno, ename, sal, sal*12+ifnull(comm, 0) annsal from emp where deptno = 10";
			
			rs = stmt.executeQuery( sql );

			while( rs.next() ) {
				System.out.print( rs.getString( "empno" ) + '\t' );
				System.out.print( rs.getString( "ename" ) + '\t' );
				System.out.print( rs.getString( "sal" ) + '\t' );
//				System.out.print( rs.getString( "annsal" ) + '\n' );
				System.out.print( rs.getString( 4 ) + '\n' );
			}
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( stmt != null ) try { stmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}

	}

}
