import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

// String[][] 를 ArrayList 로 변환
// 1. 2개의 ArrayList
// 2. 1개의 ArrayList, 1개의 TO
public class CustomTableModel extends AbstractTableModel {
	
	private String[][] datas = new String[][] {
		{"1", "2", "3"},
		{"4", "4", "5"},
		{"6", "7", "8"},
		{null, null, null},
		{null, null, null},
		{null, null, null},
		{null, null, null},
		{null, null, null},
		{null, null, null},
		{null, null, null},
	};
	
	private String[] columnNames = new String[] {
			"1열", "2열", "3열"
	};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
	}

	@Override
	public int getRowCount() {
		return datas.length;
	}

	@Override
	public int getColumnCount() {
		return datas[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return datas[rowIndex][columnIndex];
	}

}
