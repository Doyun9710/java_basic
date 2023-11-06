package pack3;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInter f;
		
		// 기존 방식
		f = new MyFunctionalInter() {
			
			@Override
			public int max(int a, int b) {
				// TODO Auto-generated method stub
				return a > b ? a : b;
			}
		};
		
		// lamda
		f = ( int a, int b ) -> { return a > b ? a : b; };
		f = ( int a, int b ) -> a > b ? a : b;
		f = ( a, b ) -> a > b ? a : b;
	}

}
