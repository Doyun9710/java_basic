import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel2 extends DefaultComboBoxModel<String> {

	private ArrayList<String> items;
	
	public CustomComboBoxModel2() {
		items = new ArrayList<String>();
		items.add( "과일선택" );
		items.add( "사과" );
		items.add( "참외" );
		items.add( "수박" );
		items.add( "딸기" );
	}
	
	// Callback - 개발자가 아닌 시스템에 의해 호출
	@Override
	public int getSize() {
//		System.out.println( "getSize() 호출" );
		return items.size();
	}
	
	@Override
	public String getElementAt(int index) {
//		System.out.println( "getElementAt() 호출" );
		return items.get(index);
	}
}
