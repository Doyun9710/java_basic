
public class Ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if( v1.equals(v2))
			System.out.println("v1과 v2는 같다");
		else
			System.out.println("v1과 v2는 다르다");
	}
}

class Value {
	int value;
	
	Value(int value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}
}