
public class SystemEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 실행시간 측정
		// milliseconds
		// long time1 = System.currentTimeMillis();
		
		// nanoseconds
		long time1 = System.nanoTime();
		
		int sum = 0;
		for( int i=1 ; i<= 1_000_000 ; i++ ) {
			sum += i;
		}
		
		// long time2 = System.currentTimeMillis();
		long time2 = System.nanoTime();
		
		System.out.println("실행시간 : " + (time2-time1));
	}

}
