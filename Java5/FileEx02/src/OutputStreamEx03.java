import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream( "C:\\Java\\java-workspace\\FileEx02\\text1.txt" );
			fos = new FileOutputStream("./newtest1.txt", true);

			int data = 0;
			while ((data = fis.read()) != -1) {
				if (data == '\n') {
					fos.write( '\n' );
				} else if (data == '\r') {
					fos.write( '\r' );
				} else {
					fos.write( data );
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("[에러]" + e.getMessage());
		} catch (IOException e) {
			System.out.println("[에러]" + e.getMessage());
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
				}
		}
	}

}
