package pack5;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		System.out.println( t1.getPriority() );
		System.out.println( t2.getPriority() );
		
		t1.setPriority( 7 );
		System.out.println( t1.getPriority() );
		
		t1.setName( "스레드 1" );
		t2.setName( "스레드 2" );
		
		
		System.out.println( "시작" );
		
		t1.start();
		t2.start();
		
		System.out.println( "끝" );
	}

}
