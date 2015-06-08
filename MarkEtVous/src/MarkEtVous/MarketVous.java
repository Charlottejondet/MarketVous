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
			calculateAverageSubject(currentSubject);						
		}
		
		calculateGeneralAverage();
		this.myIHM.displaySummaryOfAverage();
		
	}
	
	private void calculateGeneralAverage()
	{
		float generalAverage=0;
		float countGeneralCoef=0;
		for (Mark currentSubjectAverage : Subject.getListOfAverageBySubject())
		{
			generalAverage=generalAverage+ (currentSubjectAverage.getMark()*currentSubjectAverage.getCoefficient());
			countGeneralCoef=countGeneralCoef+ currentSubjectAverage.getCoefficient();
		}
		if (countGeneralCoef != 0)
		{
			generalAverage=generalAverage/countGeneralCoef;
			Spinneret.addGeneralAverageBySpinneret(generalAverage);
		}
	}
	
	private void calculateAverageSubject(Subject subject)
	{
		boolean continueCalculateAverage = this.myIHM.validateCalculation();
		while (continueCalculateAverage)
		{
			float subjectAverage = 0;
			float countCoef=0;
			for (Mark currentMark : subject.getListOfMark())
			{
				subjectAverage=subjectAverage + (currentMark.getMark()*currentMark.getCoefficient());
				countCoef= countCoef + currentMark.getCoefficient();
			}
			if (countCoef !=0 )
			{
				subjectAverage=subjectAverage/countCoef;
				Subject.addAverageSubject(subjectAverage, subject.getCoefficient());
			}
		}
		
	}

	private void inputMarks(Subject subject) 
	{
		boolean continueInput = true;
		while (continueInput) 
		{
			subject.addMark(this.myIHM.entryMark(),this.myIHM.entryCoef());
			continueInput = this.myIHM.askContinue();
			if (continueInput){
				this.inputMarks(subject);
			}
		}
	}
}

