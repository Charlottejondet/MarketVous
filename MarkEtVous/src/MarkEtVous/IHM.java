package MarkEtVous;

import java.util.ArrayList;

public interface IHM
{
	
	public float entryMark();
	public Spinneret inputSpinneret();
	public float entryCoef();
	public void displayListOfMarks(ArrayList<Mark> listOfMark);
	public boolean askContinue();
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject);
	public boolean validateCalculation();


}
