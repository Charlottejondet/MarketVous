package MarkEtVous;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import MarkEtVous.model.MarketVous;
import MarkEtVous.view.IHM;
import MarkEtVous.view.console.ConsoleIHM;
import MarkEtVous.view.gui.WindowMarketVous;


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
		new MarketVous(myIHM);
		fenetre = new WindowMarketVous();	
		MarketVous application = new MarketVous(myIHM);
		application.start();
	}

}
