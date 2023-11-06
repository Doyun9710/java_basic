import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		// 오토박싱 + 형변환
//		Integer i = Integer.valueOf(1);
//		Object o = i;
//		al.add( o );
		al.add( 1 );
		al.add( 2 );

		System.out.println( al.toString() );
	}

}
