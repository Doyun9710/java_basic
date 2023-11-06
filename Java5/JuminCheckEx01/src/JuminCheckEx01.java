
public class JuminCheckEx01 {
	public static void main(String[] args) {
		
		// 입력값 검사
		if( args.length != 1 ) {
			System.out.println("입력 오류");
			System.exit(0);
		}
		// System.out.println("정상실행");
		
		
		String jumin = args[0].replaceAll("-", "");
		System.out.println(jumin);
		
		
		int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		
		for( int i=0 ; i<bits.length ; i++ ) {
			sum += Integer.parseInt(jumin.substring(i, i+1)) * bits[i];
		}
		
		
		int lastNum = Integer.parseInt(jumin.substring( 12, 13 ));
		int resultNum = ( 11 - ( sum % 11 ) ) % 10;
		
		
		if( lastNum == resultNum ) {
			System.out.println("형식 맞음");
		} else {
			System.out.println("형식 틀림");
		}
	}
}
