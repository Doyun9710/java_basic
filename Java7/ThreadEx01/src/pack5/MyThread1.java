package pack5;

public class MyThread1 extends Thread {

	@Override
	public void run() {

		System.out.println( this.getName() + "시작" );
		
		for( int i=0 ; i<300 ; i++ ) {
			System.out.print("-");
			for( int x=0 ; x<10_000_000 ; x++ );
		}
		System.out.println();
		
	}

}
