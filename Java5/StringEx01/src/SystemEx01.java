
public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System 시스템 관련 내용
		System.out.println("프로그램 시작");
		
		// 입력값 검사
		if( args.length != 1) {
			System.out.println("1개를 입력하셔야 합니다");
			
			// 프로그램 종료
			System.exit(0);
		} 
		/*
		 * else { System.out.println("정상 실행"); }
		 */		
		System.out.println("프로그램 끝");
	}

}
