
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 생성
		String str1 = "Hello Java";
		
		// 생성자
		String str2 = new String("Hello Java");
		
		char[] arr = { 'H', 'e', 'l', 'l', 'o', ' ', 'J' };
		String str3 = new String(arr);
		
		System.out.println( str1 );
		System.out.println( str2 );
		System.out.println( str3 );
		System.out.println( str1.toString() );

		
		
		String str11 = new String("Java");
		String str12 = new String("Java");
		System.out.println(str11 == str12);			// false
		System.out.println(str11.equals(str12));	// true
		
		
		
		String str21 = "Hello Java";
		String str22 = "Hello Java";
		System.out.println(str21 == str22);			// true
		System.out.println(str21.equals(str22));	// true
	}

}
