import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JTableEx02_CustomTableModel extends AbstractTableModel {

	private ArrayList<ArrayList<Integer>> datas;
	
	private String[] columnNames = new String[] {
			"dan", "X 1", "X 2", "X 3", "X 4", "X 5", "X 6", "X 7", "X 8", "X 9"
	};
	
	public JTableEx02_CustomTableModel(int startDan, int endDan) {
		datas = new ArrayList<ArrayList<Integer>>();
		
		for( int dan=startDan ; dan<=endDan ; dan++ ) {
			ArrayList<Integer> data = new ArrayList<Integer>();
			data.add( dan );
			for( int i=1 ; i<=9 ; i++ ) {
				data.add( dan*i );
			}
			datas.add(data);
		}
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
