import java.net.MalformedURLException;
import java.net.URL;

public class URLEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String strUrl = "https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&sq=&o=&q=%EC%B6%94%EC%84%9D";
			
			URL url = new URL(strUrl);
			
			System.out.println( url.getProtocol() );
			System.out.println( url.getHost() );
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		}
	}

}
