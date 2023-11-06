import java.util.Random;

public class RandomEx02 {
	public static void main(String[] args) {
		
		// Lotto 번호 5개, 중복 X
		Random r = new Random( System.currentTimeMillis());
		
		for( int i=1 ; i<=6 ; i++ ) {
			System.out.printf( "%2d ", r.nextInt(45)+1);
		}
		System.out.println();
		
		int num;
		boolean check = true;
		int[] arr = new int[6];
		
		for( int i=0 ; i<6 ; i++ ) {
			num = r.nextInt(45) + 1;
//			System.out.println( num );
			if( i>=1 ) {
				for( int j=0 ; j<i ; j++ ) {
					if( arr[j] == num ) {
						i--;
						check = false;
						System.out.println( num + " 중복!!!!!");
					}
				}
			}
			if( check ) {
				arr[i] += num;
//				System.out.println( "추가 : " + arr[i] );
			}

			check = true;
		}
		
		for( int i=0 ; i<6 ; i++ ) {
			System.out.printf( "%2d ", arr[i] );
		}
	}
}
