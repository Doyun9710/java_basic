import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ZipcodeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null	) {
//				System.out.println( data.split( "," )[2] );	// 강남구
				String[] addresses = data.split( "," );
//				System.out.println( addresses[2] );			// 구군 데이터 추출
				
				if( addresses[2].equals("강남구") ) {
					System.out.printf( "[%s] %s %s %s %s %s\n", 
							addresses[0], addresses[1], addresses[2],
							addresses[3], addresses[4], addresses[5]);
				}
			}
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null) try { br.close(); } catch(IOException e) {}
		}
	}

}
