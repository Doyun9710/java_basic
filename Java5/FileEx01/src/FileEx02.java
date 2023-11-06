import java.io.File;
import java.io.IOException;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대경로
		File file1 = new File( "C:\\Java\\java-workspace\\FileEx01\\test1.txt" );
		
		// 상대경로
		File file2 = new File( "./test1.txt" );
		
		System.out.println( file2.getName() );
		System.out.println( file1.getParent() );
		System.out.println( file2.getParent() );
		
		System.out.println( file1.getAbsolutePath() );
		System.out.println( file2.getAbsolutePath() );
		
		try {
			System.out.println( file2.getCanonicalPath() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
