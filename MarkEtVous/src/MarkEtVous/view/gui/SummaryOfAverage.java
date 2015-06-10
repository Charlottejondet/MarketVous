package MarkEtVous.view.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

import MarkEtVous.model.Spinneret;


public class SummaryOfAverage extends JDialog implements ActionListener {

	private JButton ok;
	public SummaryOfAverage(Spinneret spinneret) {
		this.setModal(true);
		this.setSize(600, 700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		JPanel background = new BackgroundPanel();
		JPanel pan = new JPanel();
		JPanel summary = new JPanel();
		background.setLayout(new GridLayout(spinneret.getListOfAverageBySubject().size()+4, 2));
		for (int position=0;position<4;position++){
			background.add(new JLabel());
			
		}
		for (int index=0; index < spinneret.getListOfAverageBySubject().size(); index++) {
			JLabel subject = new JLabel((spinneret.getListOfSubject().get(index).getSubjectname()+" :"));
			subject.setHorizontalAlignment(SwingConstants.CENTER);
			background.add(subject);
			JLabel mark = new JLabel(Float.toString(spinneret.getListOfAverageBySubject().get(index).getMark()));
			mark.setHorizontalAlignment(SwingConstants.CENTER);
			background.add(mark);
		}	
		JLabel label = new JLabel("Moyenne g�n�rale : ");	
		label.setHorizontalAlignment(SwingConstants.CENTER);
		background.add(label);
		JLabel average = new JLabel(Float.toString(spinneret.getGeneralAverage()));
		average.setHorizontalAlignment(SwingConstants.CENTER);
		background.add(average);
		background.add(new JLabel());
		this.ok = new JButton("Ok");
		this.ok.addActionListener(this);
		background.add(this.ok);
		this.add(background);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		
	}
	
}
