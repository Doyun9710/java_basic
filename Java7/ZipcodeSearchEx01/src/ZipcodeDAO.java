import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	// DAO : 데이터베이스 연결 클래스 ( Data Access Object )
	
	private Connection conn;
	
	// 데이터베이스 연결
	public ZipcodeDAO() {
		
		String url = "jdbc:mariadb://localhost:3306/project";
		String user = "project";
		String password = "123456";
		
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println( "에러 " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "에러 " + e.getMessage() );
		} 
		// finally 선언 시 종료됨
		
	}
	
	// 각 쿼리별 메서드 생성
//	public ArrayList<String> searchZipcode( String strDong ) {
	public ArrayList<ZipcodeTO> searchZipcode( String strDong ) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
//		ArrayList<String> datas = new ArrayList<String>();
		ArrayList<ZipcodeTO> datas = new ArrayList<ZipcodeTO>();
		
		try {
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = this.conn.prepareStatement( sql );
			pstmt.setString( 1, strDong + "%" );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
//				String zipcode = rs.getString( "zipcode" );
//				String sido = rs.getString( "sido" );
//				String gugun = rs.getString( "gugun" );
//				String dong = rs.getString( "dong" );
//				String ri = rs.getString( "ri" );
//				String bunji = rs.getString( "bunji" );
//				
//				String address = String.format( "[%s] %s %s %s %s %s", 
//						zipcode, sido, gugun, dong, ri, bunji );
				
//				datas.add( address );
				
				ZipcodeTO to = new ZipcodeTO();
				
				to.setZipcode( rs.getString( "zipcode" ) );
				to.setSido( rs.getString( "sido" ) );
				to.setGugun( rs.getString( "gugun" ) );
				to.setDong( rs.getString( "dong" ) );
				to.setRi( rs.getString( "ri" ) );
				to.setBunji( rs.getString( "bunji" ) );
				
				datas.add( to );
			}
		} catch (SQLException e) {
			System.out.println( "에러 " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}
		
		return datas;
	}
	
}
