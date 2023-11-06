import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class SidoComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> sidos;
	
	public SidoComboBoxModel() {
		ZipcodeDAO dao = new ZipcodeDAO();
		sidos = dao.listSido();
	}
	
	@Override
	public int getSize() {
		return sidos.size();
	}
	
	@Override
	public String getElementAt(int index) {
		ZipcodeTO to = sidos.get(index);
		return to.getSido();
	}
}





