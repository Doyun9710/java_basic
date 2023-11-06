import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ZipcodeSearchTableCustomModel extends AbstractTableModel {
	
	private ArrayList<ZipcodeTO> datas;
	
	private String[] columnNames = new String[] {
			"우편번호", "시도", "구군", "동", "리", "번지" 
	};
	
	public ZipcodeSearchTableCustomModel() {
		datas = new ArrayList<ZipcodeTO>();
	}

	public ZipcodeSearchTableCustomModel(String strSido, String strGugun, String strDong) {
		datas = new ArrayList<ZipcodeTO>();
		ZipcodeDAO dao = new ZipcodeDAO();
		datas = dao.listAddress(strSido, strGugun, strDong);
	}
	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	@Override
	public int getRowCount() {
		return datas.size();
	}

	@Override
	public int getColumnCount() {
		return 6;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String result = "";
		ZipcodeTO to = datas.get(rowIndex);
		
		switch( columnIndex ) {
		case 0:
			result = to.getZipcode();
			break;
		case 1:
			result = to.getSido();
			break;
		case 2:
			result = to.getGugun();
			break;
		case 3:
			result = to.getDong();
			break;
		case 4:
			result = to.getRi();
			break;
		case 5:
			result = to.getBunji();
			break;
		}

		return result;
	}

}
