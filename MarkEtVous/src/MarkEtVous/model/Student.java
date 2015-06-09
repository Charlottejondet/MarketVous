package MarkEtVous.model;

/**
 * The class who define a Student
 * @author Clément
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
