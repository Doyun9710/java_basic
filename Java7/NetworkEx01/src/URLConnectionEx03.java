import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			URLConnection conn = new URL( "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png" ).openConnection();
			
			bis = new BufferedInputStream( conn.getInputStream() );
			bos = new BufferedOutputStream( new FileOutputStream( "./daum.png" ) );
			
			System.out.println( "전송완료" );
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( bis != null ) try { bis.close(); } catch(IOException e) {}
			if( bos != null ) try { bos.close(); } catch(IOException e) {}
		}
	}

}
