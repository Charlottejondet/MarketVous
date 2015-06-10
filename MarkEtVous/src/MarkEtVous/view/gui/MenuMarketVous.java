package MarkEtVous.view.gui;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import MarkEtVous.model.Mark;
import MarkEtVous.model.MarketVous;
import MarkEtVous.model.Spinneret;
import MarkEtVous.model.SpinneretType;
import MarkEtVous.model.Subject;
import MarkEtVous.view.IHM;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class MenuMarketVous extends JFrame implements IHM, Runnable, ActionListener
{

	
	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Jcombobox of different spinneret
	 */
	private JComboBox<Object> spinneret;
	/**
	 * JButton entrymark
	 */
	private JButton entryMark;
	/**
	 * Jbutton close
	 */
	private JButton close;
	/**
	 * MarketVous
	 */
	private MarketVous marketvous;

	/**
	 * Constructor of menu MarketVous
	 */
	public MenuMarketVous() {
		this.setTitle("Mark&Vous");
		this.setSize(600, 700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	@Override
	public void initWindow(MarketVous marketvous){
		this.marketvous=marketvous;
		JPanel background =new BackgroundPanel();
		this.add(background);
		background.setLayout(null);
		this.entryMark = new JButton("Entrer des notes");
		this.entryMark.setBounds(114, 212, 360, 100);
		this.entryMark.addActionListener(this);
		background.add(this.entryMark);
		this.close = new JButton("Quitter");
		this.close.addActionListener(this);
		this.close.setBounds(114, 362, 360, 100);
		background.add(this.close);

	}
	
	
	
	@Override
	public void run() {
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==this.entryMark){
			this.marketvous.addMarks();
		}
		if (arg0.getSource()==this.close){
			System.exit(0);
		}
		
	}

	@Override
	public float entryMark(Subject subject) {
		JDialog entryMark = new EntryMarkDialog(subject);
		entryMark.setVisible(true);
		return ((EntryMarkDialog) entryMark).getMark();
	}

	@Override
	public float entryCoef() {
		JDialog entryCoef = new EntryCoefDialog();
		entryCoef.setVisible(true);
		return ((EntryCoefDialog) entryCoef).getCoef();
	}

	@Override
	public void displayListOfMarks(List<Mark> listOfMark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean askContinue() {
		JDialog continueDialog = new ContinueDialog();
		continueDialog.setVisible(true);
		return ((ContinueDialog) continueDialog).getAnswer();
	}

	@Override
	public void displayListOfMarksWithSubjects(List<Subject> listOfSubject) {
		JOptionPane.showMessageDialog(this, Spinneret.displayListOfMarksWithSubject(listOfSubject)," Information ",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public boolean validateCalculation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displaySummaryOfAverage(Spinneret spinneret) {
		JDialog summaryOfAverage = new SummaryOfAverage(spinneret);
		summaryOfAverage.setVisible(true);
		
	}

	@Override
	public File inputSemester(SpinneretType type) {
		JDialog semesterDialog = new SemesterDialog(type);
		semesterDialog.setVisible(true);
		return ((SemesterDialog) semesterDialog).getSemester();
	}

	@Override
	public SpinneretType inputTitleSpinneret() {
		JDialog spinneretDialog = new SpinneretDialog();
		spinneretDialog.setVisible(true);
		return ((SpinneretDialog) spinneretDialog).getSpinneret();
	}

	@Override
	public void displaySubject(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displaySubjectAverage(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGeneralAverage(Spinneret spinneret) {
		JOptionPane.showMessageDialog(this,spinneret.getGeneralAverage()," Moyenne générale ",JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Spinneret inputSpinneret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayListOfMarks(ArrayList<Mark> listOfMark) {
		JOptionPane.showMessageDialog(this, Spinneret.displayListOfMarks(listOfMark)," Notes rentrées ",JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject) {
		// TODO Auto-generated method stub
		
	}
	
	
}
