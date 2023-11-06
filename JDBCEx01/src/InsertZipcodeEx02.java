import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class InsertZipcodeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/project";
		String user = "project";
		String password = "123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		BufferedReader br = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			conn = DriverManager.getConnection( url, user, password );
			
			stmt = conn.createStatement();
			
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null ) {
				String[] addresses = data.split( "," );
//				System.out.println( Arrays.toString( addresses ) );
//				System.out.println( addresses[3]);
				
				String sql = String.format( "insert into zipcode values ( '%s', '%s', '%s', '%s', '%s', '%s', %s )", 
						addresses[0], addresses[1], addresses[2], addresses[3], addresses[4], addresses[5], addresses[6] );
				
//				String sql = String.format( "insert into zipcode values ( " + addresses[0] + ", " + addresses[1] + ", " + addresses[2] + ", " + addresses[3] + ", " + addresses[4] + ", " + addresses[5] + ", " + addresses[6] + " );" ); 
				stmt.executeUpdate(sql);
			}

		} 
		
		// DB
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
			
		// File
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( stmt != null ) try { stmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
	}

}
