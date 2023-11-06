import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream( "./test1.txt" );
			bis = new BufferedInputStream( fis );
			
			int data = 0;
			while( ( data = bis.read() ) != -1 ) {
				System.out.print( (char)data );
			}
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( bis != null ) try { bis.close(); } catch(IOException e) {}
			if( fis != null ) try { fis.close(); } catch(IOException e) {}
		}
	}

}
