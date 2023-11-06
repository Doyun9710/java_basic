// 소요시간1 : 21, 소요시간2 : 24
public class Ex13_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		
		for( int i=0 ; i<300 ; i++ ) {
			System.out.printf( "%s", new String("-") );
		}
		
		System.out.print( "소요시간1 : " + (System.currentTimeMillis() - startTime ) );
		
		for( int i=0 ; i<300 ; i++ ) {
			System.out.printf( "%s", new String("|") );
		}
		
		System.out.print( "소요시간2 : " + (System.currentTimeMillis() - startTime ) );
	}

}
