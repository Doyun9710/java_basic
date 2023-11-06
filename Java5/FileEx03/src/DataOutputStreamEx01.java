import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형을 유지하면서 입출력
		DataOutputStream dos = null;
				
		try {
			// binary
			dos = new DataOutputStream( new FileOutputStream( "./data.txt" ) );
					
			dos.writeInt( 2023 );
			dos.writeUTF( "한글 저장" );
			dos.writeFloat( 1.8f );
			
			System.out.println( "저장 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( dos != null ) try { dos.close(); } catch(IOException e) {}
		}
	}

}
