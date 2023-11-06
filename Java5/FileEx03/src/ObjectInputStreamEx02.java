import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream( new FileInputStream( "./serial2.dat" ) );
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			Person p3 = (Person)ois.readObject();
			ArrayList list = (ArrayList)ois.readObject();
			
			System.out.println( p1 );
			System.out.println( p2 );
			System.out.println( p3 );
			System.out.println( list );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러 FN]" + e.getMessage() );
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러 CNF]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러 IO]" + e.getMessage() );
//			e.printStackTrace();
		} finally {
			if( ois != null ) try { ois.close(); } catch(IOException e) {}
		}
	}

}
