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
	
	public void addMarks()
	{
		Spinneret chosenSpinneret = this.myIHM.inputSpinneret();
		for (Subject currentSubject : chosenSpinneret.getListOfSubject()) 
		{
			boolean continueAdd = true;
			if(continueAdd)
			{
				this.switchSubject(currentSubject);
			}
			
			boolean answer = this.myIHM.displayListOfMarks(currentSubject.getListOfMark());
			
		}
		
	}

	private void switchSubject(Subject subject) 
	{
		boolean continueInput = true;
		while (continueInput) 
		{
			subject.getListOfMark().add(this.myIHM.entryMark());
			continueInput = this.myIHM.askContinue();
		}
	}
}

