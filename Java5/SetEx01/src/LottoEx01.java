import java.util.ArrayList;
import java.util.Random;

public class LottoEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> lottos = new ArrayList<Integer>();
		
		Random r = new Random( System.currentTimeMillis() );
		
		// 1. 데이터가 있는지 비교
		// 1-1. 데이터가 없을 시 추가
		// 2. 데이터 개수가 6개 인지 비교
		// 2-1. 6일 시 추가 저장 X
//		while( true ) {
//			int i = r.nextInt( 45 ) + 1;
//			
//			// 중복 값 검사
//			if( lottos.indexOf( i ) == -1 ) {
//				lottos.add( i );
//			}
//			
//			if( lottos.size() == 6 ) {
//				break;
//			}
//		}
//		
//		lottos.sort(null);
//		System.out.println( lottos.toString() );
		
		
		// 5줄 출력
		for( int re=0 ; re<5 ; re++ ) {
			// 복수 초기화 시 중복값 주의
//			Random r = new Random( System.currentTimeMillis() );
			
			while( true ) {
				int i = r.nextInt( 45 ) + 1;
				
				// 중복 값 검사
				if( lottos.indexOf( i ) == -1 ) {
					lottos.add( i );
				}
				
				if( lottos.size() == 6 ) {
					break;
				}
			}
			
			lottos.sort(null);
			System.out.println( lottos.toString() );
			lottos.clear();
		}
	}

}
