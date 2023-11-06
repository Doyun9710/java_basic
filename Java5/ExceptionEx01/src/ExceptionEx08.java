
public class ExceptionEx08 {
	public static void main(String[] args) {
		System.out.println( "시작" );
		
		if( args.length == 1 ) {
			System.out.println( "입력 : " + args[0] );
		} else {
			try {
				// 강제 Exception
				Exception e = new Exception( "발생원인" );
				throw e;
			} catch(Exception e) {
				System.out.println( "Exception 발생 : " + e.getMessage() );
			}
		}
		
		System.out.println( "끝" );
	}
}
