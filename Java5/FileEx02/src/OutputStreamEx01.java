import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		
		try {
			// 없으면 생성, 있으면 재생성(오버라이팅, 덮어쓰기)
			fos = new FileOutputStream( "./newtest1.txt" );
			
//			System.out.println( "열기 성공" );
			
			fos.write( 'a' );
			fos.write( 'b' );
			fos.write( 'c' );
			
			fos.write( '\r' );		// linux 에서는 사용 X
			fos.write( '\n' );
			
			fos.write( 'a' );
			fos.write( '\t' );
			fos.write( 'b' );
			fos.write( 'c' );
			
			System.out.println( "저장완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fos != null ) try { fos.close(); } catch(IOException e) {}
		}
	}

}
