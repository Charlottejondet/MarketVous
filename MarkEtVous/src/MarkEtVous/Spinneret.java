package MarkEtVous;
import java.util.ArrayList;


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
	
	/**
	 * A list of subject of a spinneret 
	 */
	private static ArrayList listOfSubject;
	
	public Spinneret(spinneretType type)
	{
		this.spinneretName=type;
	}
	
	/**
	 * The method who add a subject in the list of subject of the spinneret
	 * @param subject : the name of the subject 
	 */
	public void addSubject (SubjectName subject, float coef)
	{
		listOfSubject.add( new Subject(subject, coef));
	}
	

	
}
