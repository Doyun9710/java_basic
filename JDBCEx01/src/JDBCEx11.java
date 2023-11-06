import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class JDBCEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 선언 & 설정
		String url = "jdbc:mariadb://localhost:3306/project";
		String user = "project";
		String password = "123456";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		ArrayList<String> sqls = new ArrayList<String>();
		BufferedReader br = null;

		try {
			// 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");

			// 연결
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");

			stmt = conn.createStatement();
			
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));

			// INSERT
			String data = null;
			while ((data = br.readLine()) != null) {
				String[] depts = data.split(", ");
				System.out.println("\n파일 읽기\n");
				System.out.println(Arrays.toString(depts));

				sqls.add(
						String.format( "insert into dept2 values ( %s, '%s', '%s' ); \n", 
								depts[0], depts[1], depts[2] )
						);
			}
//						System.out.println( sqls.get(0) );

			for (int i = 0; i < sqls.size(); i++) {
				int result = stmt.executeUpdate(sqls.get(i));
				System.out.println("실행결과 : " + result);
			}
		} 
		
		// DB
		catch (ClassNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("[에러] " + e.getMessage());
		} 
		
		// File
		catch (FileNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if (br != null) try { br.close(); } catch (IOException e) {}
			if (rs != null) try { rs.close(); } catch (SQLException e) {}
			if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
			if (conn != null) try { conn.close(); } catch (SQLException e) {}
		}

	}

}
