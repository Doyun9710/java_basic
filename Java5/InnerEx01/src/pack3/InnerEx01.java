package pack3;

public class InnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Interface, abstract class 사용 가능

		// 방법 1
		new InnerB() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
			}
		}.viewInner();
		
		
		// 방법 2
		InnerB ib = new InnerB() {
			
			@Override
			public void viewInner() {
				// TODO Auto-generated method stub
				System.out.println("viewInner() 호출");
			}
		};
		
		ib.viewInner();
	}

}
