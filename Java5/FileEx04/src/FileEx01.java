import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileEx01 {
	public static void main(String[] args) {
		HashMap<String, String> lottos = new HashMap<String, String>();

		BufferedReader br = null;

		try {
			br = new BufferedReader( new FileReader( "./lotto.csv" ) );

			int seq = 1083+2;
			
			String data = null;
			while( ( data = br.readLine() ) != null) {
//				System.out.println( seq + "회" + data + "\n" );
				lottos.put( seq + "", data );
				seq--;
				if( seq == 1000 ) {
					System.out.println( data );
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러]" + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
		
//		System.out.println( lottos.toString() );
		System.out.println( lottos.get( "1000" ) );
	}
}

/*
br = new BufferedReader( new FileReader( "./lotto.csv" ) );
br_input = new BufferedReader( new InputStreamReader( System.in ) );

System.out.print( "확인 회차 : " );
checkNum = Integer.parseInt(br_input.readLine());
System.out.println( "입력 회차 : " + checkNum );

String data = null;
int count = -2;
while( ( data = br.readLine() ) != null	) {
//	System.out.println( data );
	count++;
	if( (seq-count) == checkNum ) {
		System.out.println( data );
		String[] strNums = data.split( "," );
		System.out.println( strNums[3] );
		for( int i=0 ; i<strNums.length ; i++ ) {
			
		}
	}
}
*/