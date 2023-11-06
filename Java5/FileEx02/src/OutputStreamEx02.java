import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		
		try {
			// true : append
			fos = new FileOutputStream( "./newtest1.txt", true );
			
			fos.write( 'a' );
			fos.write( 'b' );
			fos.write( 'c' );
			
			fos.write( '\r' );
			fos.write( '\n' );
			
			fos.write( 'a' );
			fos.write( '\t' );
			fos.write( 'b' );
			fos.write( 'c' );
			
			System.out.println( "저장완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fos != null ) try { fos.close(); } catch(IOException e) {}
		}
	}

}
