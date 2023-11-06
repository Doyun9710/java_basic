import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ZipcodeSearchDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;
	
	private String[] datas = new String[7];
	
	public String getZipcode() {
		return datas[0];
	}
	public String getSido() {
		return datas[1];
	}
	public String getGugun() {
		return datas[2];
	}
	public String getDong() {
		return datas[3];
	}
	public String getRi() {
		return datas[4];
	}
	public String getBunji() {
		return datas[5];
	}
	public String getSeq() {
		return datas[6];
	}

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			ZipcodeSearchDialog dialog = new ZipcodeSearchDialog();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public ZipcodeSearchDialog() {
		setBounds(100, 100, 450, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textField = new JTextField();
			textField.setBounds(12, 33, 269, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("우편번호 검색");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.out.println( textField.getText() );
					
					ZipcodeDAO dao = new ZipcodeDAO();
					ArrayList<ZipcodeTO> addresses = dao.listAddress( textField.getText() );
					
					table.setModel( new ZipcodeSearchTableCustomModel( textField.getText() ) );
				}
			});
			btnNewButton.setBounds(291, 32, 131, 23);
			contentPanel.add(btnNewButton);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 64, 410, 454);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table.addMouseListener( new CustomMouseEvent() );
				
				// 더블클릭 시
//				ZipcodeSearchDialog.this.dispose();
			}
		});
		scrollPane.setViewportView(table);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("확인");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// 선택 필드 반환
//						table.addMouseListener( new CustomMouseEvent() );
						
						ZipcodeSearchDialog.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("취소");
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ZipcodeSearchDialog.this.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	class CustomMouseEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println( "mouseClicked(MouseEvent e)" );
			
			int row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			for ( int i=0 ; i<table.getColumnCount() ; i++ ) {
				System.out.println( table.getModel().getValueAt( row, i ) + "\t" );
//				if( table.getModel().getValueAt( row, i ) != null ) {
//					datas[i] = (String)table.getModel().getValueAt( row, i );
//				}
				datas[i] = (String)table.getModel().getValueAt( row, i );
			}
		}
	}
}
