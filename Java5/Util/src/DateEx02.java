import java.util.Date;

public class DateEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2023.8.1 세팅
		Date d1 = new Date(2023-1900, 8-1, 1);
		Date d2 = new Date(2023-1900, 8-1, 1, 10, 10, 10);
		
		System.out.println(d1.toLocaleString());
		System.out.println(d2.toLocaleString());
		
		
		// 2023.12.24 ?요일
		Date d3 = new Date(2023-1900, 12-1, 24);
		String[] weekNames = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(weekNames[d3.getDay()]);	// 0 : 일요일
	}

}
