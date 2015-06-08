package MarkEtVous;
import java.util.ArrayList;
/**
 * The class who define a Subject
 * @author Cl�ment
 *
 */
public class Subject 
{
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
	
}
