import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String html = "<html>"
					+ "<head>"
					+ "<title>First parse</title>"
					+ "</head>"
					+ "<body>"
					+ "<p>Parsed HTML into a doc 1.</p>"
					+ "<p>Parsed HTML into a doc 2.</p>"
					+ "</body>"
					+ "</html>";
		
		// JSoup : python beautifulsoup
		Document doc = Jsoup.parse(html);
		
		System.out.println( doc.toString() );
//		System.out.println( doc.title() );
		
		Elements titles = doc.getElementsByTag("title");
		System.out.println( titles );
		System.out.println( titles.text() );
		
		Elements pTags = doc.getElementsByTag("p");
		System.out.println( pTags );
		System.out.println( pTags.size() );
		
		for( int i=0 ; i<pTags.size() ; i++ ) {
			Element pTag = pTags.get(i);
			System.out.println( pTag.tagName() );
			System.out.println( pTag.text() );
		}
	}

}
