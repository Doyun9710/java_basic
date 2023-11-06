import java.util.ArrayList;
import java.util.Scanner;

public class DataEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> students = new ArrayList<Student>();
		
		Scanner sc = new Scanner( System.in );

		for( int i=0 ; i<5 ; i++ ) {
			String s = sc.nextLine();
			
			String[] sArr = s.split( " " );
			
			int k = Integer.valueOf( sArr[2] );
			int e = Integer.valueOf( sArr[3] );
			int m = Integer.valueOf( sArr[4] );
			
			Student student = new Student( sArr[0], sArr[1], k, e, m );
			students.add(student);
		}
		
		sc.close();
		System.out.println();
		
		int count = 5;
		System.out.println( "학번 \t이름 \t국어 \t영어 \t수학 \t총합 \t평균" );
		for( Student data : students ) {
			System.out.print( data.getNum() + "\t" );
			System.out.print( data.getName() + "\t" );
			System.out.print( data.getKor() + "\t" );
			System.out.print( data.getEn() + "\t" );
			System.out.print( data.getMath() + "\t" );
			
			System.out.println();
			count--;
			if( count == 0 ) {
				System.out.print( "\t" + "\t" + "\t" + "\t" + "\t" + data.getSum() + "\t" );
				System.out.print( data.getAvg());
			}
		}
	}

}

/*
1 홍길동 100 100 100
2 김자바 80 80 90
3 안자바 60 100 80
4 남궁성 90 70 80
5 이자바 70 90 70

*/


