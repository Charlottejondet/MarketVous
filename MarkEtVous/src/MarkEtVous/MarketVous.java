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
