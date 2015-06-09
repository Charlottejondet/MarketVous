package MarkEtVous.model;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * The class who define a Spinneret 
 * @author jondetc
 *
 */
public class Spinneret
{
	/**
	 * A type of spinneret
	 */
	private final SpinneretType spinneretName;
	
	public  ArrayList<Mark> listOfAverageBySubject;
	/**
	 * The general average of the Spinneret
	 */
	private float generalAverage;
	
	/**
	 * A list of subject of a spinneret 
	 */
	private List<Subject> listOfSubject;
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
	

	public float getGeneralAverage()
	{
		return generalAverage;
	}

	public void setGeneralAverage(float generalAverage)
	{
		this.generalAverage = generalAverage;
	}

	public List<Subject> getListOfSubject() {
		return listOfSubject;
	}

	public void setListOfSubject(ArrayList<Subject> listOfSubject)
	{
		this.listOfSubject = listOfSubject;
	}

	public SpinneretType getSpinneretName()
	{
		return spinneretName;
	}
	public  void addAverageSubject(float mark, float coef)
	{
		this.listOfAverageBySubject.add(new Mark(mark,coef));
	}

	public ArrayList<Mark> getListOfAverageBySubject() 
	{
		return listOfAverageBySubject;
	}

	public void setListOfAverageBySubject(ArrayList<Mark> listOfAverageBySubject) 
	{
		this.listOfAverageBySubject = listOfAverageBySubject;
	}
	
}
