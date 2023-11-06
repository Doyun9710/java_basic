import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream( new FileInputStream( "./object.dat" ) );
			
			String[] names = (String[])ois.readObject();
			int[] ages = (int[])ois.readObject();
			double[] weights = (double[])ois.readObject();
			
			System.out.println( Arrays.toString( names ) );
			System.out.println( Arrays.toString( ages ) );
			System.out.println( Arrays.toString( weights ) );
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (ClassNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( ois != null ) try { ois.close(); } catch(IOException e) {}
		}
	}

}
