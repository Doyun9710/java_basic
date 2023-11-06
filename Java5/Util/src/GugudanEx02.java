import java.util.Scanner;

public class GugudanEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in );
		System.out.print( "구구단 입력 : " );
		
		
		
//		String str = sc.nextLine();
//		int dan = Integer.parseInt(str);
		
//		for( int i=1 ; i<=9 ; i++ ) {
//			System.out.println( dan + " X " + i + " = " + dan*i );
//		}
		
		
		
		String dans = sc.nextLine();	
		String[] arrDans = dans.split( "," );
		
		for( String dan : arrDans ) {
			for( int i=1 ; i<=9 ; i++ ) {
				System.out.printf("%s X %s = %s\n", dan, i, ( Integer.parseInt(dan) ) );
			}
			System.out.println();
		}
		
		sc.close();
	}

}
