
public class JuminCheckEx2 {
	public static void main(String[] args) {
		
		if( args.length != 1 ) {
			System.out.println("입력 오류");
			System.exit(0);
		}
		
		String jumin = args[0].replaceAll("-", "");
		System.out.println(jumin);
		
		
		Util u = new Util(jumin);
		u.capitalizeJumin();
	}
}
