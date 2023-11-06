
public class ExceptionEx10 {
	public void method1( int num ) {
		System.out.println( "시작" );

		System.out.println( "끝" );
	}
	public static void main(String[] args) {
		
		// MR -> Surround with -> try catch
		try {
			ProcessBuilder processBuilder = new ProcessBuilder(
					"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "www.google.com");
			processBuilder.start();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( e.getMessage() );
		}
	}
}
