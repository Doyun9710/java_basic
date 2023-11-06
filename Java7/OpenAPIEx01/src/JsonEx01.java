import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 => 배열
		String strJson = "[ 8, 9, 6, 2, 9 ]";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONArray arr = (JSONArray)parser.parse(strJson);
			
			System.out.println( arr );
			System.out.println( arr.size() );
			System.out.println( arr.get(0) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
