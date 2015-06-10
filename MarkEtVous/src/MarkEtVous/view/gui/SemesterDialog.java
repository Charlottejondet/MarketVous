package MarkEtVous.view.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;

import MarkEtVous.model.SpinneretType;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class SemesterDialog extends JDialog implements ActionListener{

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Jcombobox of semester 
	 */
	private JComboBox<Object> semester;
	/**
	 * Jbutton validate
	 */
	private JButton validate;
	/**
	 * Jbutton close
	 */
	private JButton close;
	/**
	 * Tyoe of spinneret
	 */
	private SpinneretType type;
	/**
	 * File 
	 */
	private File file;
	
	/**
	 * Constructor of Semester dialog which allows to chose semester according to spinneret
	 * @param type
	 */
	public SemesterDialog(SpinneretType type) {
		this.type=type;
		this.setModal(true);
		this.setSize(350, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		this.setLayout(null);
		JLabel title = new JLabel("Veuillez choisir votre semestre");
		title.setBounds(60,40, 360, 100);
		title.setFont(new Font("Freestyle Script", Font.PLAIN, 32));
		this.add(title);
		JLabel title2 = new JLabel("Mark&Vous");
		title2.setBounds(120,1, 360, 100);
		title2.setFont(new Font("Freestyle Script", Font.PLAIN, 38));
		this.add(title2);
		
		Object[] semesterList = new Object[]{"Semestre 1","Semestre 2", "Semestre 3", "Semestre 4"};
		this.semester = new JComboBox<Object>(semesterList);
		this.semester.setBounds(130,120, 110, 30);
		this.add(this.semester);
		
		this.validate = new JButton("Validation");
		this.validate.setBounds(55, 170, 100, 50);
		this.validate.addActionListener(this);
		this.add(this.validate);
		this.close = new JButton("Annuler");
		this.close.addActionListener(this);
		this.close.setBounds(195, 170, 100, 50);
		this.add(this.close);
	}
	
	/**
	 * Getter of semester
	 * @return files
	 */
	public File getSemester() {
		return this.file;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.validate){
			int index = this.semester.getSelectedIndex();
			if (index == 0){
				this.file=new File(type.toString()+"1.txt");
			}
			if (index ==1){
				this.file=new File(type.toString()+"2.txt");
			}
			if (index ==2){
				this.file=new File(type.toString()+"3.txt");
			}
			if (index ==3){
				this.file=new File(type.toString()+"4.txt");
			}
			this.dispose();
		}
		if (e.getSource()==this.close){
			this.dispose();
		}
		
	}

}
