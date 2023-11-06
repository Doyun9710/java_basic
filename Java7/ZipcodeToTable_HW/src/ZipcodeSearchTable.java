import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

public class ZipcodeSearchTable extends JFrame {
	private JPanel contentPane;
	private JComboBox cbBoxSido;
	private JComboBox cbBoxGugun;
	private JComboBox cbBoxDong;
	private JTable table;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				try {
					ZipcodeSearchTable frame = new ZipcodeSearchTable();
					frame.setVisible( true );
				} catch( Exception e ) {
					e.printStackTrace();
				}
			}
		} );
	}
	
	/**
	 * Create the frame.
	 */
	public ZipcodeSearchTable() {
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setBounds( 100, 100, 600, 800 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
        
		contentPane.setLayout( null );
          
		JPanel panel = new JPanel();
		panel.setBorder( new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9\uAE30", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)) );
		panel.setBounds( 6, 15, 566, 55 );
		contentPane.add( panel );
		panel.setLayout( null );

		
		cbBoxSido = new JComboBox();
		cbBoxSido.setModel( new SidoComboBoxModel() );
		cbBoxSido.setSelectedIndex( -1 );
		
		cbBoxSido.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					cbBoxGugun.setModel( new GugunComboBoxModel( (String)cbBoxSido.getSelectedItem() ) );
					cbBoxGugun.setSelectedIndex( 0 );
				}
			}
		} );
		cbBoxSido.setBounds( 21, 20, 160, 21 );
		panel.add( cbBoxSido );

		
		cbBoxGugun = new JComboBox();
		cbBoxGugun.setModel(new DefaultComboBoxModel(new String[] {"구군"}));
		cbBoxGugun.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					cbBoxDong.setModel( new DongComboBoxModel( 
							(String)cbBoxSido.getSelectedItem(),
							(String)cbBoxGugun.getSelectedItem() ) );
					cbBoxDong.setSelectedIndex( 0 );
				}
			}
		} );
		cbBoxGugun.setBounds( 202, 20, 160, 21 );
		panel.add( cbBoxGugun );

		
		cbBoxDong = new JComboBox();
		cbBoxDong.setModel(new DefaultComboBoxModel(new String[] {"동"}));
		cbBoxDong.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					ZipcodeDAO dao = new ZipcodeDAO();
					ArrayList<ZipcodeTO> addresses = dao.listAddress( (String)cbBoxSido .getSelectedItem(), 
																	(String)cbBoxGugun.getSelectedItem(), 
																	(String)cbBoxDong.getSelectedItem() );
					
					table.setModel( new ZipcodeSearchTableCustomModel((String)cbBoxSido .getSelectedItem(), 
							(String)cbBoxGugun.getSelectedItem(), 
							(String)cbBoxDong.getSelectedItem()) );
				}
			}
		} );
		cbBoxDong.setBounds( 383, 20, 160, 21 );
		panel.add( cbBoxDong );
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 80, 566, 671);
		contentPane.add(scrollPane);
		
		table = new JTable();
//		table.setModel( new ZipcodeSearchTableCustomModel() );
		scrollPane.setViewportView(table);
	}
}

