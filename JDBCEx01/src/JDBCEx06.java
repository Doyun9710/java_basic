import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

// 			create table tbl( col1 varchar(20) );
//			+-------+-------------+------+-----+---------+-------+
//			| Field | Type        | Null | Key | Default | Extra |
//			+-------+-------------+------+-----+---------+-------+
//			| col1  | varchar(20) | YES  |     | NULL    |       |
//			+-------+-------------+------+-----+---------+-------+
			String sql = "create table tbl( col1 varchar(20) );";
			
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
