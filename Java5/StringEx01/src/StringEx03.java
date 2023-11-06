
public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello String Hello String";
		
		
		// 문자열 위치 검색
		// indexOf, lastIndexOf
		int pos1 = str1.indexOf('l');	// 2
		System.out.println(pos1);
		int pos2 = str1.indexOf("ll");	// 2
		System.out.println(pos2);
		
		
		// 문자열의 존재 여부
		System.out.println(str1.startsWith("he"));	// 시작하는 문자열 검사, He면 true
		
		
		// 문자열 치환
		String rstr = str1.replace("Hello", "안녕");	// 안녕 String 안녕 String
		System.out.println(rstr);
		
		
		// 문자열 변환
		String jstr = str1.concat("안녕");
		System.out.println(jstr); 					// Hello String Hello String안녕
		
		
		// 
		System.out.println("hello".toUpperCase());	// HELLO
		System.out.println("hello".toLowerCase());	// hello
		
		
		// 공백제거
		String ostr1 = "         Hello Java        ";
		System.out.println(ostr1.trim());			// Hello Java
		
		
		// 문자열 분리
		String sstr = "google, banan, pineapple, kiwi";
		String[] arr1 = sstr.split(",");
		System.out.println(arr1[0]);		// google
		System.out.println(arr1[3]);		// kiwi
		
		
		// 문자열 결합
		String sstr2 = String.join(";", arr1);
		System.out.println(sstr2);
	}

}
