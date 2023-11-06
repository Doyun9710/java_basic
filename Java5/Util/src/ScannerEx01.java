import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in );
		System.out.print("입력 : ");
		
		// 한 단어만 입력
		/*
		 * String msg1 = sc.next(); 
		 * String msg2 = sc.next();
		 */
		
		String msg = sc.nextLine();
		System.out.println("입력 : " + msg);
		
		sc.close();
	}

}
