import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel1 extends DefaultComboBoxModel<String> {

	private String[] items = new String[] { "사과", "참외", "수박", "딸기" };
	
	// Callback - 개발자가 아닌 시스템에 의해 호출
	@Override
	public int getSize() {
		System.out.println( "getSize() 호출" );
		return items.length;
	}
	
	@Override
	public String getElementAt(int index) {
		System.out.println( "getElementAt() 호출" );
		return items[index];
	}
}
