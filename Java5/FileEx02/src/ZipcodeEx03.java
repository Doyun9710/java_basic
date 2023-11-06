import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ZipcodeEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader( new FileReader( "./zipcode_seoul_utf8_type2.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null	) {
				String[] addresses = data.split( "," );
				bw = new BufferedWriter( new FileWriter( "./" + addresses[1] + ".csv", true ) );

				bw.write( data );
				bw.write( "\n" );
				
				bw.close();
			}
			
			System.out.println( "분류 완료" );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null) try { br.close(); } catch(IOException e) {}
			if( bw != null) try { bw.close(); } catch(IOException e) {}
		}
		
	}

}
