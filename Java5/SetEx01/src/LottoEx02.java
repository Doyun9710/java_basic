import java.util.HashSet;
import java.util.Random;

public class LottoEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> lottos = new HashSet<Integer>();

		Random r = new Random( System.currentTimeMillis() );
		
		for( int i=0 ; i<5 ; i++ ) {
//			HashSet<Integer> lottos = new HashSet<Integer>();
			
			while( true ) {
				lottos.add( r.nextInt( 45 ) + 1 );
				if( lottos.size() == 6 ) {
					break;
				}
			}
			
			System.out.println( lottos.toString() );
			
			// 1번 선언 후 초기화가 더 실용적
			lottos.clear();
		}
	}

}
