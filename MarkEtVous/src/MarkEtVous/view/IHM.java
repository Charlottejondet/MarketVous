package MarkEtVous.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import MarkEtVous.model.Mark;
import MarkEtVous.model.MarketVous;
import MarkEtVous.model.Spinneret;
import MarkEtVous.model.SpinneretType;
import MarkEtVous.model.Subject;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public interface IHM
{
	public float entryMark(Subject subject);
	
	public float entryCoef();
	
	public void displayListOfMarks(List<Mark> listOfMark);
	
	public boolean askContinue();
	
	public void displayListOfMarksWithSubjects(List<Subject> listOfSubject);
	
	public boolean validateCalculation();
	
	public void displaySummaryOfAverage(Spinneret spinneret);
	
	public File inputSemester(SpinneretType type);
	
	public SpinneretType inputTitleSpinneret();
	
	public void displaySubject(Subject subject);
	
	public void displaySubjectAverage(Subject subject);
	
	public void displayGeneralAverage(Spinneret spinneret);
	
	public int menu();
	
	Spinneret inputSpinneret();
	
	public void displayListOfMarks(ArrayList<Mark> listOfMark);
	
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject);
	
	public void initWindow(MarketVous application);
	
}
