import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 => 객체
		String strJson = "{ \"data1\": \"value1\", \"data2\": \"value2\", }";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject obj = (JSONObject)parser.parse( strJson );
			
			System.out.println( obj );
			System.out.println( (String)obj.get("data1") );
			System.out.println( (String)obj.get("data2") );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
