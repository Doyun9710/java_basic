package pack1;

public class Outer {
	private int x1 = 100;
	private int x2 = 100;
	
	static class Inner {
		private int y1 = 100;
		public int y2 = 100;
		
		public Inner() {
			System.out.println("Inner 생성자 호출");
		}
		
		public void viewInner() {
			System.out.println("viewInner() 호출");
			
//			error
//			System.out.println( x1 );
//			System.out.println( x2 );
			System.out.println( y1 );
			System.out.println( y2 );
		}
	}
}
