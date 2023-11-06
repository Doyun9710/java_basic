package pack2;

public class InnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 지역 내부 클래스 == 지역 변수( 메서드 내부 )
		int x = 100;
		
		class Inner {
			private int y1 = 200;
			public int y2 = 200;
			
			public Inner() {
				// TODO Auto-generated constructor stub
				System.out.println("Inner 생성자 호출");
			}
			
			public void viewInner() {
				System.out.println("viewInner() 호출");
				
				System.out.println( x );
				System.out.println( y1 );
				System.out.println( y2 );
				
//				x++;	// error, x는 readonly, 지역 내부 클래스에서는 상수 취급
//				System.out.println( x );
			}
		}
		
		Inner inner = new Inner();
		inner.viewInner();
	}

}
