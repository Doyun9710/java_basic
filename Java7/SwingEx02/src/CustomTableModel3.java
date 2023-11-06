import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

// String[][] 를 ArrayList 로 변환
// 2. 1개의 ArrayList, 1개의 TO
public class CustomTableModel3 extends AbstractTableModel {

	private ArrayList<DeptTO> datas;
	
	private String[] columnNames = new String[] {
			"1열", "2열", "3열"
	};
	
	public CustomTableModel3() {
		datas = new ArrayList<DeptTO>();
		/*
		DeptTO to1 = new DeptTO();
		to1.setDeptno( "10" );
		to1.setDname( "연구부" );
		to1.setLoc( "서울" );
		DeptTO to2 = new DeptTO();
		to2.setDeptno( "20" );
		to2.setDname( "생산부" );
		to2.setLoc( "서울" );
		
		datas.add(to1);
		datas.add(to2);
		*/
		DeptDAO dao = new DeptDAO();
		datas = dao.listDept();
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
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		String result = "";
		DeptTO to = datas.get(rowIndex);
		
		switch( columnIndex ) {
		case 0:
			result = to.getDeptno();
			break;
		case 1:
			result = to.getDname();
			break;
		case 2:
			result = to.getLoc();
			break;
		}
		
		return result;
	}

}
