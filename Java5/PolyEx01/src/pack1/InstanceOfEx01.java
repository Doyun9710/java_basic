package pack1;

public class InstanceOfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E1 e1 = new E1();
		E2 e2 = new E2();
		
		// 형변환
		E e11 = new E1();
		E e12 = new E2();
		
		System.out.println( e11 instanceof E1 );	// true
		System.out.println( e11 instanceof E2 );	// false
		System.out.println( e12 instanceof E2 );	// true
		
		System.out.println( e11 instanceof E );		// true
		System.out.println( e11 instanceof E );		// true

		System.out.println( e11 instanceof Object );	// true
		// System.out.println( e11 instanceof String );	// error
		
		
		
		// 강제 형변환
		E1 e21 = (E1)e11;
		// 런타임 에러
		// E2 e22 = (E2)e11;
		
		if( e11 instanceof E2 ) {
			E2 e22 = (E2)e11;
		} else {
			System.out.println( "강제형변환 불가" );
		}
	}

}
