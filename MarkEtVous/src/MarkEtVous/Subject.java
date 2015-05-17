package MarkEtVous;
import java.util.ArrayList;
/**
 * The class who define a Subject
 * @author Clément
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
	private static ArrayList listOfMark;
	
	public Subject(SubjectName subject , float coef)
	{
		this.subjectname=subject;
		this.coefficient=coef;
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
