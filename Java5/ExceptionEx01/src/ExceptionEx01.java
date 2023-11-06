
public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "시작" );
		
//		int num1 = 10;
		int num1 = 0;
		int num2 = 20;

		// c언어 방식
		if( num1 != 0 ) {
			int result = num2 / num1;
			System.out.println( "결과 : " + result );
		}
		
		System.out.println( "끝" );
	}

}
