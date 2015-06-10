package MarkEtVous.view.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MarkEtVous.model.SpinneretType;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class SpinneretDialog extends JDialog implements ActionListener{

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Jconbobow of spinneret
	 */
	private JComboBox<Object> spinneret;
	/**
	 * Jbutton validate
	 */
	private JButton validate;
	/**
	 * Jbutton close
	 */
	private JButton close;
	/**
	 * Spinneret type
	 */
	private SpinneretType type;
	
	/**
	 * Constructor of spinneret 
	 */
	public SpinneretDialog() {
		this.setModal(true);
		this.setSize(350, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		this.setLayout(null);
		JLabel title = new JLabel("Veuillez choisir votre filière");
		title.setBounds(65,40, 360, 100);
		title.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		this.add(title);
		JLabel title2 = new JLabel("Mark&Vous");
		title2.setBounds(120,1, 360, 100);
		title2.setFont(new Font("Freestyle Script", Font.PLAIN, 38));
		this.add(title2);
		
		Object[] spinneretList = new Object[]{"INFO","GEA", "TC", "RT"};
		this.spinneret = new JComboBox<Object>(spinneretList);
		this.spinneret.setBounds(142,120, 70, 30);
		this.add(this.spinneret);
		
		this.validate = new JButton("Validation");
		this.validate.setBounds(55, 170, 100, 50);
		this.validate.addActionListener(this);
		this.add(this.validate);
		this.close = new JButton("Annuler");
		this.close.addActionListener(this);
		this.close.setBounds(195, 170, 100, 50);
		this.add(this.close);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.validate){
			int index = this.spinneret.getSelectedIndex();
			if (index == 0){
				this.type=SpinneretType.INFO;
			}
			if (index ==1){
				this.type=SpinneretType.GEA;
			}
			if (index ==2){
				this.type=SpinneretType.TC;
			}
			if (index ==3){
				this.type=SpinneretType.RT;
			}
			this.dispose();
		}
		if (e.getSource()==this.close){
			this.dispose();
		}
		
	}
	
	public SpinneretType getSpinneret(){
		return this.type;
	}

}
