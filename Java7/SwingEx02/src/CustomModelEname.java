import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomModelEname extends DefaultComboBoxModel<String> {
	
	private ArrayList<EmpTO> datas; 
	
	public CustomModelEname(String ename) {
		datas = new ArrayList<EmpTO>();
		
		EmpDAO dao = new EmpDAO();
		
		datas = dao.listEname( ename );
	}
	
	@Override
	public int getSize() {
		return datas.size();
	}
	
	@Override
	public String getElementAt(int index) {
		EmpTO to = datas.get(index);
		return to.getEname();
	}
}
