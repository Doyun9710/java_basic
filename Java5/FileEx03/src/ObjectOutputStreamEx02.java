import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream( new FileOutputStream( "./serial2.dat" ) );
			
			Person p1 = new Person( "홍길동", "010-1111-1111", 20, "서울시" );
			Person p2 = new Person( "김철수", "010-1111-2222", 24, "서울시" );
			Person p3 = new Person( "임꺽정", "010-1111-3333", 22, "서울시" );
			
			ArrayList<Person> list = new ArrayList<>();
			list.add(p1);
			list.add(p2);
			list.add(p3);
			
			oos.writeObject( p1 );
			oos.writeObject( p2 );
			oos.writeObject( p3 );
			oos.writeObject( list );
			
			System.out.println( "저장 완료" );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
			
			e.printStackTrace();
		} finally {
			if( oos != null ) try { oos.close(); } catch(IOException e) {}
		}
	}

}
