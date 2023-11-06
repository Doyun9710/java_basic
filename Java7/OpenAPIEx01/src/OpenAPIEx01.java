import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OpenAPIEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// xml
		// http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916
		
		BufferedReader br = null;
		
		StringBuilder sbXml = new StringBuilder();
		try {
			URL url = new URL( "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

			String line = null;
			while( (line = br.readLine() ) != null ) {
				sbXml.append( line.trim() );
			}
			
//			System.out.println( sbXml );
			
			Document doc = Jsoup.parse( sbXml.toString() );
			
//			Elements nmTags = doc.getElementsByTag( "movieNm" );
			Elements nmTags = doc.getElementsByTag( "dailyBoxOffice" );
			
//			System.out.println( nmTags );
			for( int i=0 ; i<nmTags.size() ; i++ ) {
				Element nmTag = nmTags.get(i);
				System.out.println( nmTag.getElementsByTag( "movieNm" ).text() );
				System.out.println( nmTag.getElementsByTag( "rank" ).text() );
				System.out.println( nmTag.getElementsByTag( "openDt" ).text() );
				System.out.println( nmTag.getElementsByTag( "salesAcc" ).text() );
				System.out.println( nmTag.getElementsByTag( "audiAcc" ).text() );
				
				System.out.println();
			}
			
		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
