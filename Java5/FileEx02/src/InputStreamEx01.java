import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 파일 열기
		// 2. 파일 읽기 + 처리
		// 3. 파일 닫기
		
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream( "C:\\Java\\java-workspace\\FileEx02\\text1.txt" );
			fis	= new FileInputStream( "../../test1.txt" );
			
			System.out.println( "Open 성공" );
		} catch (FileNotFoundException e) {
			// Error : Unhandled exception type FileNotFoundException
			// 존재하지 않는 파일 지정 시
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fis != null ) try { fis.close(); } catch (IOException e) {}
		}
	}

}
