package MarkEtVous.model;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * The class who define a Spinneret 
 * @author @author Jondet Guezel Coste Litzenburger
 *
 */
public class Spinneret
{
	/**
	 * A type of spinneret
	 */
	private final SpinneretType spinneretName;
	
	/**
	 * Array list of average subject
	 */
	public  ArrayList<Mark> listOfAverageBySubject;
	
	/**
	 * The general average of the Spinneret
	 */
	private float generalAverage;
	
	/**
	 * A list of subject of a spinneret 
	 */
	private List<Subject> listOfSubject;
	
	/**
	 * All subject for each chosen file
	 */
	private SubjectOfSpinneret fileManager;
	
	
	public Spinneret(SpinneretType type, File listOfSubjects)
	{
		this.listOfSubject=new ArrayList<Subject>();
		this.listOfAverageBySubject=new ArrayList<Mark>();
		this.fileManager=new SubjectOfSpinneret(listOfSubjects);
		try {
			this.listOfSubject=this.fileManager.readSubjects();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.spinneretName=type;
	}
	

	/**
	 * Getter of General average
	 * @return general average
	 */
	public float getGeneralAverage()
	{
		return generalAverage;
	}

	/**
	 * Setter of general average 
	 * @param generalAverage
	 */
	public void setGeneralAverage(float generalAverage)
	{
		this.generalAverage = generalAverage;
	}

	/**
	 *  Getter of list of subject
	 * @return listof subject
	 */
	public List<Subject> getListOfSubject() {
		return listOfSubject;
	}

	/** setter of list of subject
	 * @param listOfSubject
	 */
	public void setListOfSubject(ArrayList<Subject> listOfSubject)
	{
		this.listOfSubject = listOfSubject;
	}

	/**
	 * Getter of spinneret type
	 * @return spinneret name
	 */
	public SpinneretType getSpinneretName()
	{
		return spinneretName;
	}
	/**
	 * Add average subject in list of average
	 * @param mark
	 * @param coef
	 */
	public  void addAverageSubject(float mark, float coef)
	{
		this.listOfAverageBySubject.add(new Mark(mark,coef));
	}

	/**
	 * Getter list of average
	 * @return list
	 */
	public ArrayList<Mark> getListOfAverageBySubject() 
	{
		return listOfAverageBySubject;
	}

	/**
	 * setter List of average by subject
	 * @param listOfAverageBySubject
	 */
	public void setListOfAverageBySubject(ArrayList<Mark> listOfAverageBySubject) 
	{
		this.listOfAverageBySubject = listOfAverageBySubject;
	}
	
	/**
	 * Display all of entry mark
	 * @param list
	 * @return to string
	 */
	public static String displayListOfMarks(List<Mark> list) {
		StringBuilder str = new StringBuilder();
		for (Mark mark : list) {
			str.append(mark.getMark()+" ("+mark.getCoefficient()+")");
			str.append("\n");
		}
		return str.toString();
	}


	/**
	 * Display list of mark whith subject
	 * @param listOfSubject
	 * @return to string
	 */
	public static String displayListOfMarksWithSubject(
			List<Subject> listOfSubject) {
		StringBuilder str = new StringBuilder();
		for (Subject subject : listOfSubject) {
			str.append(subject.getSubjectname()+": \n");
			str.append(Spinneret.displayListOfMarks(subject.getListOfMark()));
			str.append("\n");
		}
		return str.toString();
	}
	
}
