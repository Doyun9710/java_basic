import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNum = "$1,234.5";
		DecimalFormat format = new DecimalFormat( "$#,###.#" );
		
		// 구역 드래그 -> MR -> Surround with -> try catch Block
//		double parseNum = (double)format.parse( strNum );
//		System.out.println( parseNum );
		
		try {
			double parseNum = (double)format.parse( strNum );
			System.out.println( parseNum );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
