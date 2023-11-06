import java.io.File;

public class DirEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File( "c:\\Java" );
		
		File[] lists = file.listFiles();
		
		for( File list : lists ) {
//			System.out.println( list.getName() );
			if( list.isDirectory() ) {
				System.out.println( "[" + list.getName() + "]" );
			} else {
				System.out.println( list.getName() );
			}
		}
	}

}
