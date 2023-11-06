
public class InitCapEx01 {

	public static void main(String[] args) {
		
		// 1. 띄어쓰기로 분리
		// 2. substring( 0, 1 )
		// 3. toUpperCase
		// 4. 합치기
		if( args.length != 1 ) {
			System.out.println("입력오류");
		} else {
			Util u = new Util(args[0]);
			System.out.println(u.capitalizeName());
		}
	}

}
