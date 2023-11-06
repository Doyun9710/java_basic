import java.util.ArrayList;

public class DataEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1차 배열
		Person p1 = new Person( "1", "홍길동", "010-1111-1111", "20", "서울시" );
		Person p2 = new Person( "2", "김철수", "010-1111-2222", "22", "경기도" );
		Person p3 = new Person( "3", "임꺽정", "010-1111-3333", "23", "강원도" );
		
		ArrayList<Person> datas = new ArrayList<Person>();
		
		datas.add( p1 );
		datas.add( p2 );
		datas.add( p3 );
		
		for( Person person : datas ) {
			System.out.print( person.getSeq() + "\t" );
			System.out.print( person.getName() + "\t" );
			System.out.print( person.getPhone() + "\t" );
			System.out.print( person.getAge() + "\t" );
			System.out.print( person.getRegion() + "\n" );
		}
	}

}
