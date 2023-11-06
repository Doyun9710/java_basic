import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
//			String sql = "insert into dept2 values ( 95, '생산부', '서울' )";
			String sql = "insert into dept2 values ( ?, ?, ? )";
			
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, "10" );
			pstmt.setString( 2, "개발부" );
			pstmt.setString( 3, "부산" );
			
			int result = pstmt.executeUpdate();
			
			System.out.println( "결과 : " + result );
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}

	}

}
