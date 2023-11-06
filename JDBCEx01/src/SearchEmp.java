import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		BufferedReader br = null;

		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );

			br = new BufferedReader( new InputStreamReader( System.in ) );

			String inputString = null;
			int inputDeptno;
			while( true ) {
				try {
					System.out.print( "부서번호 입력 : " );
					inputString = br.readLine();
					inputDeptno = Integer.parseInt( inputString );
					System.out.println( "입력값 : " + inputDeptno );
					break;
				} catch (NumberFormatException e) {
					if( inputString.equals("quit") ) {
						System.out.println( "프로그램 종료");
						System.exit(0);
					} else {
						System.out.println( "[에러] 잘못된 부서번호!" );
						continue;
					}
				}
			}

			String sql = "select e.empno, e.ename, e.sal, e.sal*12+ifnull(e.comm, 0) annsal, e.hiredate, d.dname, d.loc "
					+ "from emp e inner join dept d "
					+ "on ( e.deptno = d.deptno ) "
					+ "where e.deptno = ?;";

			pstmt = conn.prepareStatement( sql );
			pstmt.setInt( 1, inputDeptno );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				for( int i=1 ; i<=7 ; i++ ) System.out.print( rs.getString(i) + "\t" );
				
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (NumberFormatException e) {
			System.out.println( "[에러] " + e.getMessage() );
		}finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
			if( rs != null ) try { rs.close(); } catch(SQLException e) {}
			if( pstmt != null ) try { pstmt.close(); } catch(SQLException e) {}
			if( conn != null ) try { conn.close(); } catch(SQLException e) {}
		}

	}

}
