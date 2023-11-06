
public class ExceptionEx09 {
	public void method1( int num ) {
		System.out.println( "시작" );
		
		/*
		if( num >= 100 ) {
			System.out.println( "num 값이 100 보다 크다" );
		} else {
			System.out.println( "num 값이 100 보다 작다" );
		}
		*/
		
		// 예외 처리화
		if( num >= 100 ) {
			System.out.println( "num 값이 100 보다 크다" );
		} else {
			try {
				throw new Exception( "num 값이 100 보다 작다" );
			} catch( Exception e ) {
				System.out.println( e.getMessage() );
			}
		}
		
		System.out.println( "끝" );
	}
	
	public void method2( int num ) throws Exception {
		System.out.println( "시작" );

		if( num >= 100 ) {
			System.out.println( "num 값이 100 보다 크다" );
		} else {
			throw new Exception( "num 값이 100 보다 작다" );
		}
		
		System.out.println( "끝" );
	}
	
	public static void main(String[] args) {
		ExceptionEx09 e = new ExceptionEx09();
		e.method1( 100 );
		e.method1( 90 );
		
//		e.method2( 90 );	// error
		
		try {
			e.method2( 90 );
		} catch ( Exception e1 ) {
			System.out.println( e1.getMessage() );
		}
	}
}
