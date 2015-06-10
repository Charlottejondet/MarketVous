package MarkEtVous;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import MarkEtVous.model.MarketVous;
import MarkEtVous.view.IHM;
import MarkEtVous.view.console.ConsoleIHM;
import MarkEtVous.view.gui.MenuMarketVous;



/**
 * Launch the application Mark&Vous
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class Main {

	public static void main(String[] args) 
	{	 
		IHM myIHM = new MenuMarketVous();
		new MarketVous(myIHM);
		MarketVous application = new MarketVous(myIHM);
		myIHM.initWindow(application);
		SwingUtilities.invokeLater((Runnable) myIHM);
		
	}

}
