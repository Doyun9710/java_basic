/*
문제
주민번호 한글자 씩 분리

*2 ~ *9, *2 ~ *5, 마지막 숫자 무시
*(2 3 4 5 6 7 - 8 9 2 3 4 5 x)
모두 +
11로 나눈 나머지
11 - (11로 나눈 나머지)
10 나눈 나머지 === 마지막 숫자 
 */
public class JuminCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jumin = "971010-1388562";
		int[] numArr = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		
		String[] arr = jumin.split("-");
		jumin = arr[0] + arr[1];
		arr = jumin.split("");
		
		int[] juminArr = new int[jumin.length()];
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++) {
			juminArr[i] = Integer.parseInt(arr[i]);
		}
		for(int i=0 ; i<arr.length-1 ; i++) {
			juminArr[i] = Integer.parseInt(arr[i]);
			juminArr[i] *= numArr[i];
			sum += juminArr[i];

			System.out.println(juminArr[i] + " " + numArr[i] + " " + sum);
		}
		
		sum %= 11;
		sum = 11 - sum;

		if(juminArr[juminArr.length-1] == sum%10) {
			System.out.println("주민번호 맞음");
		} else {
			System.out.println("주민번호 아님");
		}
		
	}

}
