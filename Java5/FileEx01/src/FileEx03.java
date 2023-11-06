import java.io.File;
import java.util.Date;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File( "../../eclipse-jee-2023-06-R-win32-x86_64.zip" );
		
		// 파일의 크기
		long fileSize = file.length();
		System.out.println( fileSize );			// 바이트 단위, == 522MB
		System.out.println( fileSize/1024 );	// byte -> KByte
		System.out.println( fileSize/1024/1024 );	// 522MB
		
		// 수정한 날짜
		long fileDate = file.lastModified();
		System.out.println( fileDate );			// 1692841343940 -> Timestamp
		
		// 날짜 형태로 변경
		System.out.println( new Date(fileDate).toLocaleString() );
		
		// 용량
		System.out.println( file.getFreeSpace() );
	}

}
