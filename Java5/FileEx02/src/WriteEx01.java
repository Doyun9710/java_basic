import java.io.FileWriter;
import java.io.IOException;

public class WriteEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter bw = null;
		
		try {
			bw = new FileWriter( "./newtest1.txt" );
			
			bw.write( "abc" );
			bw.write( "\n" );
			bw.write( "cde" );
			bw.write( System.lineSeparator() );
			bw.write( "efg" );
			
			System.out.println( "저장 완료" );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( bw != null ) try { bw.close(); } catch(IOException e) {}
		}
	}

}
