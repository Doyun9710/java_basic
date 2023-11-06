package pack2;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Go g = new Go();
		Come c = new Come();
		
		System.out.println( "시작" );
		
		// 쓰레드 실행 방법 X
//		g.run();
//		c.run();
		
		g.start();
		c.start();
		
		System.out.println( "끝" );
	}

}
