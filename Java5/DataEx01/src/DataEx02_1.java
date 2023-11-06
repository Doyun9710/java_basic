import java.util.ArrayList;

public class DataEx02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// == DataEx02, ArrayList 2개
		ArrayList<String[]> al = new ArrayList<String[]>();
		String[] al1 = { "1", "홍길동", "010-1111-1111", "20", "서울시" };
		al.add( al1 );
		
		for( String[] data : al ) {
			for( String str : data ) {
				System.out.print( str + "\t" );
			}
			System.out.println();
		}
	}

}
