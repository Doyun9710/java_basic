import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SearchZipcodeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strDong = "개포";
		
		String url = "jdbc:mariadb://localhost:3306/project";
		String user = "project";
		String password = "123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );
			
			stmt = conn.createStatement();
			
			String sql = "select ipcode, sido, gugun, dong, ri, bunji from zipcode where dong like '" + strDong + "%'";
			
			rs = stmt.executeQuery( sql );
			
			while( rs.next() ) {
				System.out.print( "[" +rs.getString( "zipcode" ) + "] " );
				System.out.print( rs.getString( "sido" ) + " " );
				System.out.print( rs.getString( "gugun" ) + " " );
				System.out.print( rs.getString( "dong" ) + " " );
				System.out.print( rs.getString( "ri" ) + " " );
				System.out.print( rs.getString( "bunji" ) );
				
				System.out.println();
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
