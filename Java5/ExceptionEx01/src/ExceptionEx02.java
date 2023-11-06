
public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "시작" );
		
//		int num1 = 10;
		int num1 = 0;
		int num2 = 20;

		try {
			// Exception 밸생 가능 부분
			int result = num2 / num1;
			System.out.println( "결과 : " + result );
		} catch(ArithmeticException e) {
			System.out.println( "Exception 발생 시 처리 구문");
		}
		
		System.out.println( "끝" );
	}

}
