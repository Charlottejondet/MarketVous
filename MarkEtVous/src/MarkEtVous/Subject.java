package MarkEtVous;
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
	
	public Subject(SubjectName subject , float coef)
	{
		this.subjectname=subject;
		this.coefficient=coef;
	}
	
}
