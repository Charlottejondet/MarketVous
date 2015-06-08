package MarkEtVous;

import java.util.ArrayList;

public interface IHM {
	
	public Mark entryMark();
	public Spinneret inputSpinneret();
	public float entryCoef();
	public boolean displayListOfMarks(ArrayList<Mark> listOfMark);
	public boolean askContinue();
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject);


}
