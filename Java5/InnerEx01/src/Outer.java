
public class Outer {
	// 멤버필드
	private int x1 = 100;
	public int x2 = 100;
	
	// 인스턴스 inner(내부) class
	class Inner {
		private int y1 = 200;
		public int y2 = 200;
		
		public Inner() {
			System.out.println("Inner 생성자 호출");
		}
		
		public void viewInner() {
			System.out.println("viewInner() 호출");
			
			System.out.println( x1 );
			System.out.println( x2 );
			System.out.println( y1 );
			System.out.println( y1 );
		}
	}
}
