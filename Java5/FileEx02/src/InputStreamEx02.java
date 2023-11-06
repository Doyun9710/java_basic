import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 파일 열기
		// 2. 파일 읽기 + 처리
		// 3. 파일 닫기
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream( "C:\\Java\\java-workspace\\FileEx02\\text1.txt" );
//			fis	= new FileInputStream( "./test1.txt" );
			
			// 내용 읽기
			int data = fis.read();		// IOException 예외처리, try catch 추가
			System.out.println( (char)data );
			
			data = fis.read();
			System.out.println( (char)data );
			
			data = fis.read();
			System.out.println( (char)data );
			
			byte[] datas = new byte[5];
			int count = fis.read( datas );
			System.out.println( Arrays.toString( datas ) );
			System.out.println( (char)datas[0] );
			System.out.println( (char)datas[4] );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fis != null ) try { fis.close(); } catch (IOException e) {}
		}
	}

}
