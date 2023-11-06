import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel extends DefaultComboBoxModel<String> {
	
//	private String[] datas;
	private ArrayList<String> datas;

	public CustomComboBoxModel() {
		EmpDAO dao = new EmpDAO();
//		datas = dao.listJob();
		datas = dao.listJob2();
	}

	@Override
	public int getSize() {
//		return datas.length;
		return datas.size();
	}
	
	@Override
	public String getElementAt(int index) {
//		return datas[index];
		return datas.get(index);
	}
}
