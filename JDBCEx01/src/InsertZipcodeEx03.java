import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class InsertZipcodeEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mariadb://localhost:3306/project";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BufferedReader br = null;
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			conn = DriverManager.getConnection( url, user, password );
			
			String sql = "insert into zipcode values ( ?, ?, ?, ?, ?, ?, ? )";
			
			pstmt = conn.prepareStatement( sql );
			
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null ) {
				String[] addresses = data.split( "," );
				
				pstmt.setString( 1, addresses[0] );
				pstmt.setString( 2, addresses[1] );
				pstmt.setString( 3, addresses[2] );
				pstmt.setString( 4, addresses[3] );
				pstmt.setString( 5, addresses[4] );
				pstmt.setString( 6, addresses[5] );
				pstmt.setString( 7, addresses[6] );
				
				pstmt.executeUpdate();
			}
//			select count(*) from zipcode; 이용해 진행상황 확인
			
			System.out.println( "저장완료" );
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
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
	}

}
