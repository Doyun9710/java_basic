import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx06 {

	public static void main(String[] args) {

		// JSON
		// http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230916

		BufferedReader br = null;
		
		StringBuilder sbJson = new StringBuilder();
		try {
			URL url = new URL( "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EC%98%A4%ED%8E%9C%ED%95%98%EC%9D%B4%EB%A8%B8" );
			br = new BufferedReader( new InputStreamReader( url.openStream() ) );

			String strJson = br.readLine();

			JSONParser parser = new JSONParser();
			JSONObject root = (JSONObject)parser.parse( strJson );

			JSONObject boxOfficeResult = (JSONObject)root.get( "boxOfficeResult" );
//			System.out.println( boxOfficeResult );
			
			JSONArray weeklyBoxOfficeLists = (JSONArray)boxOfficeResult.get( "weeklyBoxOfficeList" );
//			System.out.println( weeklyBoxOfficeLists );
			
			for( int i=0 ; i<weeklyBoxOfficeLists.size() ; i++ ) {
				JSONObject obj = (JSONObject)weeklyBoxOfficeLists.get(i);
				System.out.println( obj.get( "rank" ) );
				System.out.println( obj.get( "movieNm" ) );
				System.out.println( obj.get( "audiAcc" ) );
				System.out.println( obj.get( "salesAcc" ) );
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
