package MarkEtVous.model;

/**
 * An enum of all the spinneret type available
 * @author Clément
 *
 */
public enum SpinneretType 
{
	
	/**
	 * The spinneret INFO 
	 */
	INFO("infos"),
	/**
	 * The spinneret GEA
	 */
	GEA("geas"),
	/**
	 * The spinneret TC
	 */
	TC("tcs"),
	/**
	 * The spinneret RT
	 */
	RT("rts");
	
	private String representation;

	private SpinneretType(String repr) {
		this.representation = repr;
	}
	
	@Override
	public String toString() {
		return this.representation;
	}
	
}
