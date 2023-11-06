import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ZipcodeEx02 {

	public static void main(String[] args) {

		// 입력값 검사

		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null	) {
				String[] addresses = data.split( "," );
				
//				if( addresses[3].substring(0, 2).equals(args[0]) ) {
				if( addresses[3].startsWith( args[0] ) ) {
					System.out.printf( "[%s] %s %s %s %s %s\n", 
							addresses[0], addresses[1], addresses[2],
							addresses[3], addresses[4], addresses[5]);
				}
			}
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null) try { br.close(); } catch( IOException e ) {}
		}
		
	}

}
