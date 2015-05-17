
package MarkEtVous;

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
	private final spinneretType spinneretName;
	
	/**
	 * The general average of the Spinneret
	 */
	private static float generalAverage;
	
	public Spinneret(spinneretType type)
	{
		this.spinneretName=type;
	}
	
	public void addSubject (SubjectName subject)
	{
		new Subject(subject);
	}
	

	
}
