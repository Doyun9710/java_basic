package pack1;

public class TreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Go g = new Go();
		Come c = new Come();
		
		System.out.println( "시작" );
		
		// 순차처리
		g.run();
		c.run();
		
		System.out.println( "끝" );
	}

}
