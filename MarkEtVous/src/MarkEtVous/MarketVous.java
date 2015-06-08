 package MarkEtVous;

import java.awt.List;
import java.util.Scanner;

public class MarketVous
{
	
	IHM myIHM = new consoleIHM();
	
	public MarketVous() 
	
	{
		this.myIHM.entryMark();
		List listeDeNote = new List();
		listeDeNote.add(str);
		Average(listeDeNote[],2);
		
	}
	
	public int Average(List notes, int coeff)
	{
		for(int i = 0; i < notes.size(); i++)
		{
			System.out.println(notes.get(i));
		}
	}
}

