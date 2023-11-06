import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random r1 = new Random();
		// seeding
		Random r1 = new Random( System.currentTimeMillis() );
		
		System.out.println( r1.nextDouble() );
		
		System.out.println( r1.nextInt() );
		
		// 0 <= X < 10
		System.out.println( r1.nextInt(10) );
		System.out.println( r1.nextInt(10) );
		
		// lotto, 1 <= x < 46
		System.out.println( r1.nextInt(45) + 1 );
	}

}
