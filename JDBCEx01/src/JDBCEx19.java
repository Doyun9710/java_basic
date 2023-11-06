import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx19 {

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

		int inputDeptno = 20;
		
		try {
			// 로딩
			Class.forName( "org.mariadb.jdbc.Driver" );
			System.out.println( "드라이버 로딩 성공" );
			
			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println( "연결 성공" );

			br = new BufferedReader( new InputStreamReader( System.in ) );

//			System.out.print( "부서번호 입력 : " );
//			inputDeptno = Integer.parseInt( br.readLine() );
//			System.out.println( "부서번호 : " + inputDeptno );
			
			while( true ) {
				String inputString = null;
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
						System.out.println( "[에러] 잘못된 부서번호 !!!" );
						continue;
					}
				}
			}

//			String sql = "select e.empno empno, e.ename ename, e.sal sal, e.sal*12+ifnull(comm, 0) annsal, e.hiredate hiredate, d.dname dname, d.loc loc "
//					+ "from emp e inner join dept d "
//					+ "on e.deptno = d.deptno "
//					+ "where e.dept=?";
			
			String sql = "select e.empno, e.ename, e.sal, e.sal*12+ifnull(e.comm, 0) annsal, e.hiredate, d.dname, d.loc "
					+ "from emp e inner join dept d "
					+ "on ( e.deptno = d.deptno ) "
					+ "where e.deptno = ?;";
			
//			String sql = "select e.empno, e.ename, e.sal, e.sal*12+ifnull(e.comm, 0) annsal, e.hiredate, d.dname, d.loc from emp e inner join dept d on ( e.deptno = d.deptno ) where e.deptno=?;";
			
			pstmt = conn.prepareStatement( sql );
			pstmt.setInt( 1, inputDeptno );
			
			rs = pstmt.executeQuery();
			
			while( rs.next() ) {
				System.out.print( rs.getString( "e.empno" ) + "\t" );
				System.out.print( rs.getString( "e.ename" ) + "\t" );
				System.out.print( rs.getString( "e.sal" ) + "\t" );
				System.out.print( rs.getString( "annsal" ) + "\t" );
				System.out.print( rs.getString( "e.hiredate" ) + "\t" );
				System.out.print( rs.getString( "d.dname" ) + "\t" );
				System.out.print( rs.getString( "d.loc" ) + "\t" );
				
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
