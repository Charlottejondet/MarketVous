package MarkEtVous.view.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import MarkEtVous.model.SpinneretType;
import MarkEtVous.model.Subject;

public class EntryMarkDialog extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton validate;
	private JButton close;
	private JTextField markInput;
	private float mark;
	
	public EntryMarkDialog(Subject subject) {
		this.setModal(true);
		this.setSize(350, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		this.setLayout(null);
		JLabel title = new JLabel("Veuillez saisir votre note");
		title.setBounds(28,35, 360, 100);
		title.setFont(new Font("Note this", Font.PLAIN, 25));
		this.add(title);
		JLabel title2 = new JLabel(subject.getSubjectname());
		title2.setBounds(100,1, 360, 100);
		title2.setFont(new Font("Note this", Font.PLAIN, 28));
		this.add(title2);
		
		this.markInput=new JTextField();
		this.markInput.setBounds(130,120, 110, 30);
		this.add(this.markInput);
		
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
		if (e.getSource()==this.validate && this.markInput.getText().length()!=0){
			if (this.isFloat(this.markInput.getText())){
				this.mark=Float.parseFloat(this.markInput.getText());
				this.dispose();
			}
		}
		if (e.getSource()==this.close){
			this.mark=-1;
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
	
	public Float getMark() {
		return this.mark;
	}
}
