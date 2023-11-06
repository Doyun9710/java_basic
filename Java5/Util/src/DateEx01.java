import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.util.Date d = new java.util.Date();
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		String strDate = d.toLocaleString();
		System.out.println(strDate);
		
		
		// 년도 월 일
		String[] dateArr = strDate.split(". ");
		// System.out.println(strDate.substring(0, 4));
		System.out.println(dateArr[0]);
		System.out.println(dateArr[1]);
		System.out.println(dateArr[2]);
		
		
		//
		System.out.println("년 : " + (d.getYear()+1900));
		System.out.println("월 : " + (d.getMonth()+1));
		System.out.println("일 : " + d.getDate());
		System.out.println("요일 : " + d.getDay());	// 일요일이 0
		
		System.out.println("시 : " + d.getHours());
	}

}
