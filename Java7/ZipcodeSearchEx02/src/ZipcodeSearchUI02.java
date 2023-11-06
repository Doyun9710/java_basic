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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ZipcodeSearchUI02 extends JFrame {
	private JPanel contentPane;
	private JComboBox combo1;
	private JComboBox combo2;
	private JComboBox combo3;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI02 frame = new ZipcodeSearchUI02();
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
	public ZipcodeSearchUI02() {
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
          
		combo1 = new JComboBox();
		//combo1.setModel(new DefaultComboBoxModel(new String[] {"시도"}));
		combo1.setModel( new SidoComboBoxModel() );
		combo1.setSelectedIndex( 0 );
		
		combo1.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					combo2.setModel( new GugunComboBoxModel( (String)combo1.getSelectedItem() ) );
					combo2.setSelectedIndex( 0 );
				}
			}
		} );
		combo1.setBounds( 21, 20, 160, 21 );
		panel.add( combo1 );
          
		combo2 = new JComboBox();
		combo2.setModel(new DefaultComboBoxModel(new String[] {"구군"}));
		combo2.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					combo3.setModel( new DongComboBoxModel( 
							(String)combo1.getSelectedItem(),
							(String)combo2.getSelectedItem() ) );
					combo3.setSelectedIndex( 0 );
				}
			}
		} );
		combo2.setBounds( 202, 20, 160, 21 );
		panel.add( combo2 );
          
		combo3 = new JComboBox();
		combo3.setModel(new DefaultComboBoxModel(new String[] {"동"}));
		combo3.addItemListener( new ItemListener() {
			public void itemStateChanged( ItemEvent e ) {
				if( e.getStateChange() == ItemEvent.SELECTED ) {
					textArea.setText( "" );
                    
					ZipcodeDAO dao = new ZipcodeDAO();
					ArrayList<ZipcodeTO> addresses = dao.listAddress( (String)combo1 .getSelectedItem(), (String)combo2.getSelectedItem(), (String)combo3.getSelectedItem() );
					
					for( ZipcodeTO to : addresses ) {
						String address = String.format( "[%s] %s %s %s %s %s", to.getZipcode(), to .getSido(), to.getGugun(), to.getDong(), to.getRi(), to.getBunji() );
               
						textArea.append( address + "\n" );
					}

				}
			}
		} );
		combo3.setBounds( 383, 20, 160, 21 );
		panel.add( combo3 );
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(12, 80, 560, 671);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}

