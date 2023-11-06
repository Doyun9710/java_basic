import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream( new FileOutputStream( "./object.dat" ) );
			
			String[] names = { "홍길동", "김철수", "임꺽정" };
			int[] ages = { 55, 23, 37 };
			double[] weights = { 71.4, 67.9, 58.6 };
			
			oos.writeObject( names );
			oos.writeObject( ages );
			oos.writeObject( weights );
			
			System.out.println( "저장 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( oos != null ) try { oos.close(); } catch(IOException e) {}
		}
	}

}
