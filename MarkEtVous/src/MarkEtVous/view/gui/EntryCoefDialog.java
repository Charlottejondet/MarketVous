package MarkEtVous.view.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EntryCoefDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton validate;
	private JButton close;
	private JTextField coefInput;
	private float coef;
	
	public EntryCoefDialog() {
		this.setModal(true);
		this.setSize(350, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		this.setLayout(null);
		JLabel title = new JLabel("Veuillez saisir le coefficient");
		title.setBounds(28,35, 360, 100);
		title.setFont(new Font("Note this", Font.PLAIN, 25));
		this.add(title);
		JLabel title2 = new JLabel("Mark&Vous");
		title2.setBounds(100,1, 360, 100);
		title2.setFont(new Font("Note this", Font.PLAIN, 28));
		this.add(title2);
		
		this.coefInput=new JTextField();
		this.coefInput.setBounds(130,120, 110, 30);
		this.add(this.coefInput);
		
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
		if (e.getSource()==this.validate && this.coefInput.getText().length()!=0){
			if (this.isFloat(this.coefInput.getText())){
				this.coef=Float.parseFloat(this.coefInput.getText());
				this.dispose();
			}
		}
		if (e.getSource()==this.close){
			this.coef=-1;
			this.dispose();
		}
		
	}

	private boolean isFloat(String text) {
		try {
			Float.parseFloat(text);
			return true;
		} catch (Exception e){
			return false;
		}
	}
	
	public Float getCoef() {
		return this.coef;
	}

}
