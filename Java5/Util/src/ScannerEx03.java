import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in );
		
//		while(true) {
//			System.out.print( "입력 : " );
//			String dans = sc.nextLine();
//			if( !dans.equals("q") ) {
//				System.out.println( "입력 메시지 : " + dans );
//			} else {
//				System.out.println( "종료" );
//				break;
//			}
//		}
		
		String dans;
		do {
			System.out.print( "입력 : " );
			dans = sc.nextLine();
			System.out.println( "입력 메시지 : " + dans );
		} while( !dans.equals("q") );
		System.out.print( "종료" );
		sc.close();
	}

}
