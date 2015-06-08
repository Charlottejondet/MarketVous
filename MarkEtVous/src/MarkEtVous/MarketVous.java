 package MarkEtVous;

import java.awt.List;
import java.util.Scanner;

public class MarketVous
{
	
	private IHM myIHM;
	
	public MarketVous(IHM ihm) 
	{
		this.myIHM=ihm;	
	}
	
	public void addMarks(){
		Spinneret chosenSpinneret = this.myIHM.inputSpinneret();
		for (Subject currentSubject : chosenSpinneret.getListOfSubject()) {
			boolean continueInput = true;
			while (continueInput) {
				currentSubject.getListOfMark().add(this.myIHM.entryMark());
				continueInput = this.myIHM.askContinue();
			}
			boolean answer = this.myIHM.displayListOfMarks(currentSubject.getListOfMark());
			
		}
		
		List<> listeDeNote = new List();
		Subject.listOfMark.add(str)
		
		
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

