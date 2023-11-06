
public class Util {
	private String jumin;
	
	public Util(String jumin) {
		this.jumin = jumin;
	}
	
	public void capitalizeJumin() {
		int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int sum = 0;
		
		for( int i=0 ; i<bits.length ; i++ ) {
			sum += Integer.parseInt(jumin.substring(i, i+1)) * bits[i];
		}
		
		
		int lastNum = Integer.parseInt(jumin.substring( 12, 13 ));
		int resultNum = ( 11 - ( sum % 11 ) ) % 10;
		
		
		if( lastNum == resultNum ) {
			System.out.println("형식 맞음");
		} else {
			System.out.println("형식 틀림");
		}
	}
}
