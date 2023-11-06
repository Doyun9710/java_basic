import java.io.File;
import java.util.Arrays;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File( "c:\\java" );
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html
		// list() -> String[]
		// listFiles() -> File[]
		String[] lists = file.list();
		System.out.println( Arrays.toString( lists ) );
		
		for( String list : lists ) {
			System.out.println( list );
		}
		
		File[] listFiles = file.listFiles();
		for( File listFile : listFiles ) {
			System.out.println( listFile.getName() );
		}
	}

}
