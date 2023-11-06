import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx04 {

	public static void main(String[] args) {

		// JSON
		// http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916

		BufferedReader br = null;
		
		StringBuilder sbJson = new StringBuilder();
		try {
			URL url = new URL( "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

//			String line = null;
//			while( (line = br.readLine() ) != null ) {
//				sbJson.append( line.trim() );
//			}
//			System.out.println( sbJson );
			
			String strJson = br.readLine().split( "\"weeklyBoxOfficeList\":" )[1];
			strJson = strJson.replace( "}}", "" );
//			System.out.println( strJson );

			JSONParser parser = new JSONParser();
			JSONArray arr = (JSONArray)parser.parse( strJson );
			
//			System.out.println( arr );
//			System.out.println( (JSONObject)arr.get(0) );

			for( int i=0 ; i<arr.size() ; i++ ) {
				JSONObject obj = (JSONObject)arr.get(i);
				System.out.println( obj.get( "movieNm" ) );
			}

		} catch (MalformedURLException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (IOException e) {
			System.out.println( "[에러] " + e.getMessage() );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if( br != null ) try { br.close(); } catch(IOException e) {}
		}
	}

}
