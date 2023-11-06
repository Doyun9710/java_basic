package pack4;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i=1 ; i<=10 ; i++ ) {
					System.out.println( "Go : " + i );
				}
			}
		});
		
		Thread t2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for( int i=1 ; i<=10 ; i++ ) {
					System.out.println( "Come : " + i );
				}
			}
		});
		
		System.out.println( "시작" );
		
		t1.start();
		t2.start();
		
		System.out.println( "끝" );
		
	}

}
