package pack1;

public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInter f;
		
		// 간소화 1
//		f = () -> {
//			System.out.println( "method() 호출" );
//		};
		
		// 간소화 2
		f = () -> System.out.println( "method() 호출" );
		
		f.method();
	}

}
