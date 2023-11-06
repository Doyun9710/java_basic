import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {

//	private String[] values = new String[] {"사과", "참외", "수박", "딸기", "자두", "포도", "사과", "참외", "수박", "딸기", "자두", "포도"};
	private ArrayList<String> datas;
	
	public CustomListModel() {
		datas = new ArrayList<String>();
		datas.add( "사과" );
		datas.add( "참외" );
		datas.add( "수박" );
		datas.add( "딸기" );
	}
	
	@Override
	public int getSize() {
//		return values.length;
		return datas.size();
	}

	@Override
	public String getElementAt(int index) {
//		return values[index];
		return datas.get(index);
	}

}
