import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx02 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		FileReader fr = null;
		
		fr = new FileReader( "./test1.txt" );
		
		int data = 0;
		while( (data = fr.read() ) != -1 ) {
			System.out.print( (char)data );
		}
		
		if( fr != null ) try { fr.close(); } catch(IOException e) {}
	}

}
