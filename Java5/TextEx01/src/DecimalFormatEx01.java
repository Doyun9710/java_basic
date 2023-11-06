import java.text.DecimalFormat;

public class DecimalFormatEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat format = new DecimalFormat( "#, ###.0" );
		
		double dblNum = 1234.5;
		
		String strNum = format.format(dblNum);
		System.out.println( strNum );
	}

}
