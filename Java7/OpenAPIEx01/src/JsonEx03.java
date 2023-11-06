import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 => 객체
		String strJson = "[ { \"data1\": \"value1\", \"data2\": \"value2\", }, { \"data1\": \"value1\", \"data2\": \"value2\", } ]";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONArray arr = (JSONArray)parser.parse( strJson );
			
			System.out.println( arr );
			System.out.println( (JSONObject)arr.get(0) );
			
			JSONObject obj = (JSONObject)arr.get(0);
			
			System.out.println( obj.get( "data1" ) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
