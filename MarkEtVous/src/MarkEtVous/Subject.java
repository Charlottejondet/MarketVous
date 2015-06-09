package MarkEtVous;
import java.io.File;
import java.util.ArrayList;
/**
 * The class who define a Subject
 * @author Cl�ment
 *
 */
public class Subject 
{
	
	private final File infos1;

	private final File infos3;
	private final File infos4;
	
	private final File geas1;
	private final File geas2;
	private final File geas3;
	private final File geas4;
	
	private final File tcs1;
	private final File tcs2;
	private final File tcs3;
	private final File tcs4;
	
	private final File rts1;
	private final File rts2;
	private final File rts3;
	private final File rts4;
	/**
	 * The name of the subject
	 */
	private final SubjectName subjectname;
	/**
	 * the coefficient of the subject
	 */
	private final float coefficient;
	/**
	 * the average of the subject
	 */
	private static float averageSubject;
	
	/**
	 * A list of mark of a Subject
	 */
	public static ArrayList<Mark> listOfMark;
	
	public static ArrayList<Mark> listOfAverageBySubject;
	
	public Subject(SubjectName subject , float coef)
	{
		this.subjectname=subject;
		this.coefficient=coef;
	}
	
	public static float getAverageSubject() {
		return averageSubject;
	}

	public static void setAverageSubject(float averageSubject) {
		Subject.averageSubject = averageSubject;
	}

	public static ArrayList<Mark> getListOfMark() {
		return listOfMark;
	}

	public static void setListOfMark(ArrayList<Mark> listOfMark) {
		Subject.listOfMark = listOfMark;
	}

	public SubjectName getSubjectname() {
		return subjectname;
	}

	public float getCoefficient() {
		return coefficient;
	}

	/**
	 * Add a mark in the list of mark of the Subject
	 * @param mark : the value of the mark
	 */
	public void addMark (float mark,float coef)
	{
		listOfMark.add( new Mark(mark,coef));
	}
	
	public static void addAverageSubject(float mark, float coef)
	{
		listOfAverageBySubject.add( new Mark(mark,coef));
	}

	public static ArrayList<Mark> getListOfAverageBySubject() 
	{
		return listOfAverageBySubject;
	}

	public static void setListOfAverageBySubject(ArrayList<Mark> listOfAverageBySubject) 
	{
		Subject.listOfAverageBySubject = listOfAverageBySubject;
	}
	
}
