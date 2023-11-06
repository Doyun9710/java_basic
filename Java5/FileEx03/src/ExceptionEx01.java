import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try ~ with ~ resource
		try( FileInputStream fis = new FileInputStream( "./data.txt" ) ) {
			int data = 0;
			while( ( data = fis.read() )  != -1 ) {
				System.out.println( (char)data );
			}
		} catch(IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		}
	}

}
