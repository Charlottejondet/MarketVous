package MarkEtVous.model;

/**
 * The class who define a Student
 * @author Cl�ment
 *
 */
public class Student 
{
	/**
	 * A type of spinneret 
	 */
	private Spinneret spinneretType;
	
	public Student(SpinneretType type) 
	{
		this.spinneretType=new Spinneret(type);
	}
	
}
