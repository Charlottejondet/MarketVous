package MarkEtVous;

import javax.swing.SwingUtilities;


/**
 * Launch the application Mark&Vous
 * @author guezelc
 *
 */
public class Main {

	
	
	public static void main(String[] args) 
	{
		IHM myIHM = new ConsoleIHM();
		new MarketVous(myIHM);
		SwingUtilities.invokeLater(new WindowMarketVous());
		
	}

}
