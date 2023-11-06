
public class Util {
	private String name;
	
	public Util(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public String capitalizeName() {
		String[] names = this.name.split(" ");
		
		String result = "";
		for( String name : names ) {
			result += name.substring(0, 1).toUpperCase()
					+ name.substring(1) + " ";
		}
		
		return result;
	}
}
