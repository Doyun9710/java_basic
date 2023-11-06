import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
//			isr = new InputStreamReader( System.in );
			br = new BufferedReader( new InputStreamReader( System.in ) );
			
			System.out.print( "입력 : " );
			
			// 한 글자 씩
//			System.out.println( "입력값 : " + (char)br.read() );
//			System.out.println( "입력값 : " + (char)br.read() );
//			System.out.println( "입력값 : " + (char)br.read() );
			
			System.out.println( "입력값 : " + br.readLine() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
