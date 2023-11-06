
public class StringBuilderEx01 {
	
	public static void main(String[] args) {
		// 생성자
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(100);
		StringBuilder sb3 = new StringBuilder("Hello Java");
		
		System.out.println(sb1.capacity());		// 16
		System.out.println(sb2.capacity());		// 100
		System.out.println(sb3.capacity());		// 26 -> 문자열 길이 + 16
		
		System.out.println(sb1.length());		// 0
		System.out.println(sb2.length());		// 0
		System.out.println(sb3.length());		// 10
		
		
		// chartAt
		// substring
		// indexOf
		// replace
		
		
		// 내부 문자열 조작
		// append / insert / delete
		System.out.println(sb3);	// Hello Java
		sb3.append("안녕");
		System.out.println(sb3);	// Hello Java안녕
		sb3.insert(3, "추가 내용");
		System.out.println(sb3);	// Hel추가 내용lo Java안녕
		sb3.delete(0, 4);
		System.out.println(sb3);	// 가 내용lo Java안녕
	}
}
