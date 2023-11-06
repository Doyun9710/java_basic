import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		
		StringBuilder sbHtml = new StringBuilder();
		try {
			URL url = new URL( "https://news.daum.net" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

			String line = null;
			String lines = null;
			while( (line = br.readLine() ) != null ) {
				lines += line;
				sbHtml.append( line.trim() );
			}
			
//			Document doc = Jsoup.parse(lines);
			Document doc = Jsoup.parse(sbHtml.toString());
			
			// data-tiara-layer="article_main"
			Elements lists = doc.getElementsByAttributeValue( "data-tiara-layer", "article_main");
			System.out.println( "기사 갯수 : " + lists.size() );
			
			for( Element list : lists ) {
				System.out.println( list.text() );
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
