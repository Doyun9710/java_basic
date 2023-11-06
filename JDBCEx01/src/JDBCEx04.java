import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// mariadb
		/* dept2 table 생성
		 * MariaDB [sample]> create table dept2 as select * from dept;
		 */
		
		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
			stmt = conn.createStatement();
			
			String deptno = "80";
			String dname = "연구부";
			String loc = "서울";
			
//			String sql = "insert into dept2 values ( 60, '개발부', '서울' )";
//			String sql = "insert into dept2 values ( " + deptno + ", '" + dname + "', '" + loc + "' )";
			String sql = String.format( "insert into dept2 values ( %s, '%s', '%s' )", deptno, dname, loc );
			
			int result = stmt.executeUpdate( sql );
			System.out.println( "실행결과 : " + result );
			
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
			if( stmt != null ) try { stmt.close(); } catch(SQLException e) {}
		}

	}

}
