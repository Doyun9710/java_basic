import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<String> datas; 
	
	public CustomComboBoxModel() {
		// TODO Auto-generated constructor stub
		EmpDAO dao = new EmpDAO();
		datas = dao.listJob();
				
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		//return datas.length;
		return datas.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		//return datas[index];
		return datas.get(index);
	}
}
