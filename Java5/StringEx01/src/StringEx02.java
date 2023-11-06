
public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello String Hello String";
		
		System.out.println(str1.length());
		System.out.println("Hello".length());
		
		
		// 문자열(String) - 문자(char)
		char c1 = str1.charAt(0);
		char c2 = str1.charAt(5);
		System.out.println(c1);
		System.out.println(c2);
		
		
		// 문자열(String) - 문자열(String)
		String pstr1 = str1.substring(2);
		System.out.println(pstr1);
		
		String pstr2 = str1.substring(2, 4);
		System.out.println(pstr2);
	}

}
