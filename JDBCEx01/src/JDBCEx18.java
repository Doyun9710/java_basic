import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCEx18 {

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
			Class.forName( "org.mariadb.jdbc.Driver" );

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from emp";
			pstmt = conn.prepareStatement( sql );
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println( rsmd.getColumnCount() );
			
			for( int i=1 ; i<=rsmd.getColumnCount() ; i++ ) {
//				System.out.println( rsmd.getTableName( i ) );
				
				System.out.println( rsmd.getColumnName( i ) );
				System.out.println( rsmd.getColumnTypeName( i ) );
				
				System.out.println( rsmd.getPrecision( i ) );
				System.out.println( rsmd.getScale( i ) );			// decimal
				
				System.out.println( rsmd.isNullable( i ) );			// Null 허용 여부, not null : 0
			}
			
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
