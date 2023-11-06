import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

// String[][] 를 ArrayList 로 변환
// 1. 2개의 ArrayList
// 2. 1개의 ArrayList, 1개의 TO
public class CustomTableModel2 extends AbstractTableModel {

	private ArrayList<ArrayList<String>> datas;
	
	private String[] columnNames = new String[] {
			"1열", "2열", "3열"
	};
	
	public CustomTableModel2() {
		datas = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add( "11" );
		data1.add( "12" );
		data1.add( "13" );
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add( "21" );
		data2.add( "22" );
		data2.add( "23" );
		
		datas.add(data1);
		datas.add(data2);
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
		return datas.get(0).size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return datas.get(rowIndex).get(columnIndex);
	}

}
