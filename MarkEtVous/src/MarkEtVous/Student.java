package MarkEtVous;

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
	
	public Student(spinneretType type) 
	{
		this.spinneretType=new Spinneret(type);
	}
	
}
