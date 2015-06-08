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
			this.inputMarks(currentSubject);
			this.myIHM.displayListOfMarks(currentSubject.getListOfMark());			
		}
		this.myIHM.displayListOfMarksWithSubjects(chosenSpinneret.getListOfSubject());
		
	}
	
	public void calculateAverage()
	{
		Spinneret chosenSpinneret = this.myIHM.inputSpinneret();
		for (Subject currentSubject : chosenSpinneret.getListOfSubject()) 
		{
			
		}
	}

	private void inputMarks(Subject subject) 
	{
		boolean continueInput = true;
		while (continueInput) 
		{
			subject.getListOfMark().add(this.myIHM.entryMark());
			continueInput = this.myIHM.askContinue();
			if (continueInput){
				this.inputMarks(subject);
			}
		}
	}
}

