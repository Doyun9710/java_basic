import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String html = "<html>"
					+ "<head>"
					+ "<title>First parse</title>"
					+ "</head>"
					+ "<body>"
					+ "<p id='i1' Class='c1'>Parsed HTML into a doc 1.</p>"
					+ "<p id='i2' Class='c2'>Parsed HTML into a doc 2.</p>"
					+ "<p id='i3' Class='c3'>Parsed HTML into a doc 3.</p>"
					+ "<p id='i4' Class='c4'>Parsed HTML into a doc 4.</p>"
					+ "</body>"
					+ "</html>";

		Document doc = Jsoup.parse(html);
		

		// doc.getElementByID()
		
		// doc.getElementsByTag()
		// doc.getElementsByClass()
		// doc.getElementsByAttribute()
		
		Element pTag = doc.getElementById( "i1" );
		System.out.println( pTag );
		
		Elements pTags = doc.getElementsByClass( "c1" );
		System.out.println( pTags );
	}

}
