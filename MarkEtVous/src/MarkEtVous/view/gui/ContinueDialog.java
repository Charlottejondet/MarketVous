package MarkEtVous.view.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class ContinueDialog extends JDialog implements ActionListener{

	
	/**
	 * SerialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * JButton yes
	 */
	private JButton yes;
	/**
	 * JButton no
	 */
	private JButton no;
	/**
	 * Boolean which discribe answer
	 */
	private boolean answer;
	
	/**
	 * Constructor of continue dialog, which ask if user hope to continue add or not
	 */
	public ContinueDialog() {
		this.setModal(true);
		this.setSize(400, 300);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		this.setLayout(null);
		JLabel title = new JLabel("Voulez-vous continuer la saisie pour cette matière ?");
		title.setBounds(10,80, 360, 100);
		title.setFont(new Font("Freestyle Script", Font.PLAIN, 28));
		this.add(title);
		JLabel title2 = new JLabel("Mark&Vous");
		title2.setBounds(120,1, 360, 100);
		title2.setFont(new Font("Freestyle Script", Font.PLAIN, 38));
		this.add(title2);
		
		this.yes = new JButton("Oui");
		this.yes.setBounds(70, 170, 100, 50);
		this.yes.addActionListener(this);
		this.add(this.yes);
		this.no = new JButton("Non");
		this.no.addActionListener(this);
		this.no.setBounds(210, 170, 100, 50);
		this.add(this.no);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==this.yes){
			this.answer=true;
			this.dispose();
		}
		if (e.getSource()==this.no){
			this.answer=false;
			this.dispose();
		}
		
	}

	
	/** Getter of answer
	 * @return answer
	 */
	public boolean getAnswer() {
		return this.answer;
	}

}
