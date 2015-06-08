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
	private static float mark;
	/**
	 * The coefficient of the mark
	 */
	private static float coefficient;
	
	public Mark(float markNum, float coef)
	{
		this.mark=markNum;
		this.coefficient=coef;
	}

	public static float getMark() {
		return mark;
	}

	public static void setMark(float mark) {
		Mark.mark = mark;
	}

	public static float getCoefficient() {
		return coefficient;
	}

	public static void setCoefficient(float coefficient) {
		Mark.coefficient = coefficient;
	}
	
	
}
