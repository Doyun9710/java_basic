import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx03 {

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
			int data = 0;
			while( (data = fis.read() ) != -1 ) {
//				System.out.print( (char)data );		// 다국어(영어제외) 깨짐, 엔터키도 읽음
				
				// window 	- 엔터키 \r\n
				// unix 	- 엔터키 \n
				if( data == '\n' ) {
					System.out.print( "(n)" );
				} else if( data == '\r' ) {
					System.out.print( "(r)" );
				} else {
					System.out.print( (char)data );
				} // ==> abcdefghijk(r)(n)123456789(r)(n)ê°ëë¤ë¼ë§ë°ì¬
			}
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fis != null ) try { fis.close(); } catch (IOException e) {}
		}
	}

}
