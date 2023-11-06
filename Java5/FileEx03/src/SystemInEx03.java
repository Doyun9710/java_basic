import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
		
		InputStream is = null;
		BufferedReader br = null;
		
		try {
			is = System.in;
//			br = new BufferedReader( new InputStreamReader( System.in ) );
			
			System.out.print( "단수 : " );
			System.out.println( "입력값 : " + (char)br.read() );
//			System.out.println( "입력값 : " + br.readLine() );
			char c = (char)br.read();
			int num = (int)br.read();
			System.out.println( num );
			Gugudan( num );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( is != null ) try { is.close(); } catch(IOException e) {}
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}
	
	public static void Gugudan( int num ) {
		for( int i=1 ; i<=9 ; i++ ) {
			System.out.println( num + " X " + i + " = " + (num*i) );
		}
	}

}
