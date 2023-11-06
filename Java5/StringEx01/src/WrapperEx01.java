
public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 최대 최소
		System.out.println(Integer.MIN_VALUE);	// -2147483648
		System.out.println(Integer.MAX_VALUE);	// 2147483648
		
		System.out.println(Double.MIN_VALUE);	// 4.9E-324
		System.out.println(Double.MAX_VALUE);	// 1.7976931348623157E308
		
		
		
		// 형변환
		Integer i1 = Integer.valueOf( 123 );
		Integer i2 = Integer.valueOf( "123" );
		
		// Autoboxing
		Integer i3 = 123;
		
		byte b = i1.byteValue();
		float f = i1.floatValue();
		String s = i1.toString();
		
		// unboxing
		int i4 = i3;
	}

}
