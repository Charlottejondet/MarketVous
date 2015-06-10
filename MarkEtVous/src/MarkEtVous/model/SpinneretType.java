package MarkEtVous.model;

/**
 * An enum of all the spinneret type available
 * @author Jondet Guezel Coste Litzenburger
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
	
	/**
	 * representation of spinneret
	 */
	private String representation;

	/** 
	 * Constructor or spinneret type
	 * @param repr
	 */
	private SpinneretType(String repr) {
		this.representation = repr;
	}
	
	@Override
	public String toString() {
		return this.representation;
	}
	
}
