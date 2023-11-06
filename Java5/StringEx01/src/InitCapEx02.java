
public class InitCapEx02 {
	public static void main(String[] args) {
		if( args.length != 1 ) {
			System.out.println("입력오류");
		} else {
			Util u = new Util(args[0]);
			System.out.println(u.capitalizeName());
		}
	}
}
