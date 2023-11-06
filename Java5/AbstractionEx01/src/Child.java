
public class Child extends Parent {
	
	public Child() {
		System.out.println( "Child 생성자 호출" );
	}
	
	@Override
	void viewParent() {
		System.out.println( "Child viewParent");
	}

}
