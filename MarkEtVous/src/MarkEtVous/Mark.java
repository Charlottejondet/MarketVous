package MarkEtVous;
/**
 * The class who define the Mark that we can recorded
 * @author Clément
 *
 */
public class Mark
{
	/**
	 * The value of the mark
	 */
	public final static float mark;
	/**
	 * The coefficient of the mark
	 */
	public final static coefficient;
	
	public Mark(float markNum, float coef)
	{
		this.mark=markNum;
		this.coefficient=coef;
	}
}
