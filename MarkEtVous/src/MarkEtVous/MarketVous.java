 package MarkEtVous;

import java.awt.List;
import java.util.Scanner;

public class MarketVous
{
	public MarketVous() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir une note :");
		String str = sc.nextLine();
		List listeDeNote = new List();
		listeDeNote.add(str);
		
	}
	
	public int average(List notes)
	{
		return 0;
	}
}
