import java.text.DecimalFormat;

public class Ex10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number = 1234567.89;
		String[] pattern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"0000000000.0000",
				"##########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#,####.##",
				// (생략)
				"'#'#,###",
				"''#,###",
		};
		
		for( int i=0 ; i<pattern.length ; i++ ) {
			DecimalFormat df = new DecimalFormat( pattern[i] );
			System.out.printf( "%s19s : %s\n", pattern[i], df.format( number ) );
		}
	}

}
