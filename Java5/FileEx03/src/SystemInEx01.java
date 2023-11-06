import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SystemInEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
		
		InputStream is = null;
		
		try {
			is = System.in;
			System.out.print( "입력 : " );
//			System.out.print( "입력값 : " + is.read() );	// byte
			System.out.println( "입력값 : " + (char)is.read() );
			System.out.println( "입력값 : " + (char)is.read() );
			System.out.println( "입력값 : " + (char)is.read() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( is != null ) try { is.close(); } catch(IOException e) {}
		}
	}

}
