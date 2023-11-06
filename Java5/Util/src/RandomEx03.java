import java.util.Random;

public class RandomEx03 {
	public static void main(String[] args) {
		
		// Lotto 번호 5개, 중복 X
		Random r = new Random( System.currentTimeMillis());
		
		for( int i=1 ; i<=6 ; i++ ) {
			System.out.printf( "%2d ", r.nextInt(45)+1);
		}
		
	}
}
