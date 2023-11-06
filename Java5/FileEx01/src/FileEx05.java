import java.io.File;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 디레토리
		// 생성 / 이름 변경 / 삭제
		
		File file = new File( "c:\\java\\dir1" );
		File file2 = new File( "c:\\java\\dir2" );
		
		System.out.println( file.exists() );	// false -> mkdir() -> true
		
		// 디렉토리 생성
//		if( file.mkdir() ) {
//			System.out.println( "생성성공" );
//		}
		
		// 디렉토리 이름 변경
//		if( file.renameTo(file2) ) {
//			System.out.println( "변경성공" );
//		}
		
		// 디렉토리 삭제 성공
		if( file2.delete() ) {
			System.out.println( "삭제성공" );
		}
	}

}
