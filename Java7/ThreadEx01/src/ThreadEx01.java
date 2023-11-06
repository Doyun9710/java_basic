
public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( Thread.currentThread().getName() );	// main Thread
		
		System.out.println( Thread.currentThread().getPriority() );	// 5
		System.out.println( Thread.currentThread().MIN_PRIORITY );	// 1
		System.out.println( Thread.currentThread().MAX_PRIORITY );	// 10
		System.out.println( Thread.currentThread().NORM_PRIORITY );	// 5
	}

}
