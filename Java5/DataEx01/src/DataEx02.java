import java.util.ArrayList;

public class DataEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// == DataEx02, ArrayList 2개
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add( "1" );
		data1.add( "홍길동" );
		data1.add( "010-1111-1111" );
		data1.add( "20" );
		data1.add( "서울시" );

		ArrayList<String> data2 = new ArrayList<String>();
		data2.add( "2" );
		data2.add( "김철수" );
		data2.add( "010-1111-2222" );
		data2.add( "22" );
		data2.add( "경기도" );
		
		
		ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();
		datas.add( data1 );
		datas.add( data2 );
		
		for( ArrayList<String> data : datas ) {
			for( String str : data ) {
				System.out.print( str + "\t" );
			}
			System.out.println();
		}
	}

}
