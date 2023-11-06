
public class ExceptionEx07 {
	public static void main(String[] args) {
		System.out.println( "시작" );
		
		int num1 = 10;
		int num2 = 20;
		
		try {
			int result = num2 / num1;
			System.out.println( "결과 : " + result );
		} catch(ArithmeticException e) {
			System.out.println( "Exception 발생");
		} finally {
			System.out.println( "모두 실행" );
		}
		
		System.out.println( "끝" );
	}
}
