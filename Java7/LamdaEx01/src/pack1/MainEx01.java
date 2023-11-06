package pack1;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 익명 내부 클래스
		new MyFunctionalInter() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println( "method() 호출" );
			}
		}.method();
		
		MyFunctionalInter f = new MyFunctionalInter() {
			
			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println( "method() 호출" );
			}
		};
		
		f.method();
	}

}
