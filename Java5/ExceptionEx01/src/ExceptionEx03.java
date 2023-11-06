
public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "시작" );
		
		String[] datas = { "1", "2", "3" };
		
		try {
			System.out.println( datas[0] );
			System.out.println( datas[6] );	// 여기서부터 중단
			System.out.println( datas[0] );
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( "Exception 발생" );
			System.out.println( e.getMessage() );
			e.printStackTrace();
		}
		
		System.out.println( "끝" );
	}

}
