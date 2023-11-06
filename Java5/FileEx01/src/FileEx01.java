import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 디렉토리 객체 생성
		File dir1 = new File( "c:\\java" );
		File dir2 = new File( "c:/java" );
		
		// 파일 객체 생성
		File file1 = new File( "c:\\java\\Hello.java" );
		File file2 = new File( "c:/java/Hello.java" );
		
		
		// 존재유무
		// exists / isDirectory / isFile
		if( dir1.exists() ) {
			System.out.println( "디렉토리 존재" );
		} else {
			System.out.println( "디렉토리 존재하지 않음" );
		}
		
		if( dir1.isDirectory() ) {
			System.out.println( "isDirectory" );
		} else {
			System.out.println( "is not Directory" );
		}
		
		
		// 실행가능 / 읽기가능 / 쓰기가능 / 숨김파일 검사
		// canExecute() / canRead() / can.Write() / isHidden()
		
		File file = new File( "c:\\java\\test1.txt" );
		System.out.println( file.isHidden() );
	}

}
