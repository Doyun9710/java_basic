import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class DongComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> dongs;
	
	public DongComboBoxModel() {
	}
	
	public DongComboBoxModel(String strSido, String strGugun) {
		ZipcodeDAO dao = new ZipcodeDAO();
		dongs = dao.listDong( strSido, strGugun );
	}
	
	
	@Override
	public int getSize() {
		return dongs.size();
	}
	
	@Override
	public String getElementAt(int index) {
		ZipcodeTO to = dongs.get(index);
		return to.getDong();
	}
}
