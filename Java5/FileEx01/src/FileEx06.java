import java.io.File;
import java.io.IOException;

public class FileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File( "c:\\java\\test2.txt" );
		File file2 = new File( "c:\\java\\test3.txt" );
		
		try {
			if( file.createNewFile() ) {
				System.out.println( "파일 생성 성공" );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// renameTo, delete()
//		file.renameTo(file2);
		
		if( file2.delete() ) {
			System.out.println( "삭제성공" );
		}
	}

}
