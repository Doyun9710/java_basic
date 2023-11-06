
public class ExceptionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "시작" );
		
		String name = null;
		int num1 = 0;
		int num2 = 10;
		
		try {
			System.out.println( "믄자열의 길이" + name.length() );
			
			int result = num2 / num1;
			System.out.println( "결과 : " + result );
			System.out.println( "끝" );
		} catch(Exception e) {
			System.out.println( "Exception 발생" );
		}
		
	}

}
