import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( "./test1.txt" ) );
			
//			int data = 0;
//			while( (data = br.read() ) != -1 ) {
//				System.out.print( (char)data );
//			}
			
			String data = null;
			while( ( data = br.readLine() ) != null	) {
//				System.out.print( data + "\n" );
				System.out.println( data );
			}
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
