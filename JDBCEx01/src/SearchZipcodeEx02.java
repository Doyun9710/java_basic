import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchZipcodeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
			stmt = conn.createStatement();
			
//			String sql = "show tables;";
			String sql = "show full tables where table_type = 'base table';";
			
			rs = stmt.executeQuery( sql );

			System.out.println( "[ Tables_in_sample ]" );
			while( rs.next() ) {
//				System.out.print( rs.getString( 1 ) );
				System.out.println( rs.getString( "Tables_in_sample" ) );
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( stmt != null ) try { stmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
	}

}
