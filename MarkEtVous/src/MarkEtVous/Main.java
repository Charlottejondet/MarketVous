package MarkEtVous;


/**
 * Launch the application Mark&Vous
 * @author guezelc
 *
 */
public class Main {

	
	
	public static void main(String[] args) 
	{
		IHM myIHM = new ConsoleIHM();
		MarketVous application = new MarketVous(myIHM);
		application.addMarks();
		
	}

}
