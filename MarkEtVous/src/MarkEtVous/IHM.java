package MarkEtVous;

import java.util.ArrayList;

import javax.swing.JFrame;

public interface IHM {
	
	public float entryMark();
	public Spinneret inputSpinneret();
	public float entryCoef();
	public void displayListOfMarks(ArrayList<Mark> listOfMark);
	public boolean askContinue();
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject);

	
}
