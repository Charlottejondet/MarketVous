package MarkEtVous;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 * Launch the application Mark&Vous
 * @author guezelc
 *
 */
public class Main {

	private static WindowMarketVous fenetre;

	public static void main(String[] args) 
	{	    
		IHM myIHM = new ConsoleIHM();
//<<<<<<< HEAD
		new MarketVous(myIHM);
		fenetre = new WindowMarketVous();	
//=======
		MarketVous application = new MarketVous(myIHM);
		application.addMarks();
//>>>>>>> branch 'master' of https://github.com/Charlottejondet/MarketVous.git
	}

}
