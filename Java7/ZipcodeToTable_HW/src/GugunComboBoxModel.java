import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class GugunComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> guguns;
	
	public GugunComboBoxModel() {
	}
	
	public GugunComboBoxModel(String strSido) {
		ZipcodeDAO dao = new ZipcodeDAO();
		guguns = dao.listGugun( strSido );
	}
	
	
	@Override
	public int getSize() {
		return guguns.size();
	}
	
	@Override
	public String getElementAt(int index) {
		ZipcodeTO to = guguns.get(index);
		return to.getGugun();
	}
}
