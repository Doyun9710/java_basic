import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
			String sql = "select empno, ename, sal from emp";
			
			pstmt = conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			
			/*
			while( rs.next() ) {
				System.out.print( rs.getString( "empno" ) + "\t" );
				System.out.print( rs.getString( "ename" ) + "\t" );
				System.out.println( rs.getString( "sal" ) );
			}
			*/
			
			rs.absolute( 1 );
			System.out.println( rs.getRow() );
			System.out.println( rs.getString( "empno" ) );
			
			rs.absolute( 10 );
			System.out.println( rs.getRow() );
			System.out.println( rs.getString( "empno" ) );
			
			rs.last();
			System.out.println( rs.getRow() );				// 데이터 갯수
			System.out.println( rs.getString( "empno" ) );
			
//			System.out.println( rs.next() );				// false
			
			// 커서 원위치
			rs.beforeFirst();
			
			rs.next();
			System.out.println( rs.getString( "empno" ) );
			
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}

	}

}
