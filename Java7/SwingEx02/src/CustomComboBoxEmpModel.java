import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxEmpModel extends DefaultComboBoxModel<String> {

	private ArrayList<String> items;
	
	public CustomComboBoxEmpModel() {
		super( new CustomComboBoxEmpDAO().listJob() );
	}
	
//	// Callback - 개발자가 아닌 시스템에 의해 호출
//	@Override
//	public int getSize() {
////		System.out.println( "getSize() 호출" );
//		return items.size();
//	}
//	
//	@Override
//	public String getElementAt(int index) {
////		System.out.println( "getElementAt() 호출" );
//		return items.get(index);
//	}
}
