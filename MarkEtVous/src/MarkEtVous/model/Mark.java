package MarkEtVous.model;
/**
 * The class who define the Mark that we can recorded
 * @author Jondet Guezel Coste Litzenburger
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
	
	/**
	 * Constructor of Mark
	 * @param mark 
	 * @param coef
	 */
	public Mark(float mark, float coef)
	{
		this.mark=mark;
		this.coefficient=coef;
	}

	/**
	 * Getter of mark
	 * @return mark
	 */
	public float getMark() {
		return this.mark;
	}

	/**
	 * Setter of mark
	 * @param mark
	 */
	public void setMark(float mark) {
		this.mark = mark;
	}

	/**
	 * Getter of coefficient
	 * @return coefficient
	 */
	public float getCoefficient() {
		return coefficient;
	}

	/**
	 * Setter of coefficient
	 * @param coefficient
	 */
	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}
	
	
}
