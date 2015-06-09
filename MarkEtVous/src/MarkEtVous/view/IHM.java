package MarkEtVous.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import MarkEtVous.model.Mark;
import MarkEtVous.model.Spinneret;
import MarkEtVous.model.SpinneretType;
import MarkEtVous.model.Subject;

public interface IHM
{
	public float entryMark();
	public float entryCoef();
	public void displayListOfMarks(List<Mark> listOfMark);
	public boolean askContinue();
	public void displayListOfMarksWithSubjects(List<Subject> listOfSubject);
	public boolean validateCalculation();
	public void displaySummaryOfAverage();
	public File inputSemester(SpinneretType type);
	public SpinneretType inputTitleSpinneret();
	public void displaySubject(Subject subject);
	public void displaySubjectAverage(Subject subject);
	public void displayGeneralAverage(Spinneret spinneret);
	public int menu();
	Spinneret inputSpinneret();
	void displayListOfMarks(ArrayList<Mark> listOfMark);
	void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject);
	
}
