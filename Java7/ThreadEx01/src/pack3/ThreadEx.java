package pack3;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Go g = new Go();
		Come c = new Come();
		
		Thread t1 = new Thread( g );
		Thread t2 = new Thread( c );
//		Thread t2 = new Thread( new Come() );
		
		System.out.println( "시작" );
		
		t1.start();
		t2.start();
		
		System.out.println( "끝" );
	}

}
