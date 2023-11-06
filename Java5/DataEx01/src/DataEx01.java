
public class DataEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data1 = { "1", "홍길동", "010-1111-1111", "20", "서울시" };
		String[] data2 = { "2", "김철수", "010-1111-2222", "22", "경기도" };
		String[] data3 = { "3", "임꺽정", "010-1111-3333", "23", "강원도" };
		
		String[][] datas = new String[3][];
		datas[0] = data1;
		datas[1] = data2;
		datas[2] = data3;
		
		// 향상된 for 문을 통해 data 출력
		for( String[] d : datas ) {
			for( String v : d ) {
				System.out.print( v + "\t" );
			}
			System.out.println();
		}
	}

}
