import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream( "./test1.txt" );
			fos = new FileOutputStream( "./test2.txt" );
			
			// 복사
			int data = 0;
			while( ( data = fis.read() ) != -1 ) {
				fos.write( data );
			}
			
			System.out.println( "복사 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fis != null ) try { fis.close(); } catch(IOException e) {}
			if( fos != null ) try { fos.close(); } catch(IOException e) {}
		}
	}

}
