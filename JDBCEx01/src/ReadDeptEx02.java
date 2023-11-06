import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadDeptEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sqls = new ArrayList<String>();
				
		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader( "./dept.csv" ) );
			
			String data = null;
			while( ( data = br.readLine() ) != null ) {
				String[] depts = data.split( "," );
				//System.out.println( Arrays.toString( depts ) );
				
				sqls.add( String.format( "insert into dept2 values ( %s, '%s', '%s')", 
						depts[0], depts[1], depts[2] ) );
			}

			System.out.println( sqls );
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
