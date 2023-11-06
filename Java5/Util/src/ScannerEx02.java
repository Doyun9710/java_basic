import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// id
		// pw
		Scanner sc = new Scanner( System.in );
		
		System.out.print( "아이디 : " );
		String id = sc.nextLine();
		
		System.out.print( "비밀번호 : " );
		String pw = sc.nextLine();
		
		System.out.println( id + "/" + pw );
		
		sc.close();
	}

}
