import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx10 {

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
			
//			String sql = "select empno, ename, sal, date_format( hiredate, '%Y/%m/%d' ) hiredate from emp;";
			String sql = "select empno, ename, sal, hiredate from emp;";
			
			rs = stmt.executeQuery( sql );

			while( rs.next() ) {
				System.out.print( rs.getString( "empno" ) + '\t' );
				System.out.print( rs.getString( "ename" ) + '\t' );
				System.out.print( rs.getString( "sal" ) + '\t' );
				System.out.print( rs.getString( "hiredate" ).replace("-", "/") + '\n' );
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
