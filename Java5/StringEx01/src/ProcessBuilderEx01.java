
public class ProcessBuilderEx01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ProcessBuilder processBuilder = new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "www.google.com");
		processBuilder.start();
	}

}
