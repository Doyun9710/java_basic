import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );

			conn = DriverManager.getConnection(url, user, password);

			DatabaseMetaData dmd = conn.getMetaData();
			
			System.out.println( dmd.getDatabaseProductName() );		// MariaDB
			System.out.println( dmd.getDatabaseProductVersion() );	// 11.1.2-MariaDB
			
			System.out.println( dmd.getDriverName() );				// MariaDB Connector/J
			System.out.println( dmd.getDriverVersion() );			// 3.2.0
			
			System.out.println( dmd.getURL() );						// jdbc:mariadb://localhost/sample?user=root&password=***
			System.out.println( dmd.getUserName() );				// root
			
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}

	}

}
