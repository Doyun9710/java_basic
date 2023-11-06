import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream( "./config.prperties" );
			
			Properties props = new Properties();
			props.setProperty( "id", "andy" );
			props.setProperty( "password", "1234" );
			props.setProperty( "grade", "d" );
			
			props.setProperty( "주소", "서울시" );
			props.setProperty( "이름", "홍길동" );
			
			System.out.println( props.toString() );
			
			props.store( fos, "System.config" );	// 설명글
			
			System.out.println( "저장 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( fos != null ) try { fos.close(); } catch(IOException e) {}
		}
	}

}
