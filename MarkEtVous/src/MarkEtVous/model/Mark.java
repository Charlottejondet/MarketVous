package MarkEtVous.model;
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
	private float mark;
	/**
	 * The coefficient of the mark
	 */
	private float coefficient;
	
	public Mark(float mark, float coef)
	{
		this.mark=mark;
		this.coefficient=coef;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
	
	
}
