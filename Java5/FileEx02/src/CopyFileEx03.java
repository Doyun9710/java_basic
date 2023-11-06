import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long timeStart = System.currentTimeMillis();

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream( new FileInputStream( "./Jellyfish.jpg" ) );
			bos = new BufferedOutputStream( new FileOutputStream( "./newJellyfish.jpg" ) );
			
			// 복사
			int data = 0;
			while( ( data = bis.read() ) != -1 ) {
				bos.write( data );
			}
			
			System.out.println( "복사 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( bis != null ) try { bis.close(); } catch(IOException e) {}
			if( bos != null ) try { bos.close(); } catch(IOException e) {}
		}
		
		long timeEnd = System.currentTimeMillis();
		System.out.println( ( timeEnd - timeStart ) / 1000.0 );	// 0.021
	}

}
