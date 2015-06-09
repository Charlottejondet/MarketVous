 package MarkEtVous.model;

import java.awt.List;
import java.io.File;
import java.util.Scanner;

import MarkEtVous.view.IHM;

public class MarketVous
{
	
	private IHM myIHM;
	
	private Spinneret spinneret;
	
	public MarketVous(IHM ihm) 
	{
		this.myIHM=ihm;	
	}
	
	public void addMarks()
	{
		SpinneretType choosenSpinneret = this.myIHM.inputTitleSpinneret();
		if (choosenSpinneret!=null){
		File fileSpinneret = this.myIHM.inputSemester(choosenSpinneret);
		
			this.spinneret= new Spinneret(choosenSpinneret, fileSpinneret);
			for (Subject currentSubject : this.spinneret.getListOfSubject()) 
			{
				this.inputMarks(currentSubject);
				this.myIHM.displayListOfMarks(currentSubject.getListOfMark());			
			}
			this.myIHM.displayListOfMarksWithSubjects(this.spinneret.getListOfSubject());
		}
	}
		
	
	
	public void calculateAverage()
	{
		for (Subject currentSubject : this.spinneret.getListOfSubject()) 
		{
			this.calculateAverageSubject(currentSubject);						
		}
		
		this.calculateGeneralAverage();
		this.myIHM.displaySummaryOfAverage();
		
	}
	
	private void calculateGeneralAverage()
	{
		float generalSum=0;
		float countGeneralCoef=0;
		for (Mark currentSubjectAverage : this.spinneret.getListOfAverageBySubject())
		{
			generalSum+= (currentSubjectAverage.getMark()*currentSubjectAverage.getCoefficient());
			countGeneralCoef+= currentSubjectAverage.getCoefficient();
		}
		if (countGeneralCoef != 0)
		{
			this.spinneret.setGeneralAverage(generalSum/countGeneralCoef);
			this.myIHM.displayGeneralAverage(this.spinneret);
		}
	}
	
	private void calculateAverageSubject(Subject subject)
	{

			float subjectSum = 0;
			float countCoef=0;
			for (Mark currentMark : subject.getListOfMark())
			{
				subjectSum+= (currentMark.getMark()*currentMark.getCoefficient());
				countCoef+= currentMark.getCoefficient();
			}
			if (countCoef !=0 )
			{
				subject.setAverageSubject(subjectSum/countCoef);
				this.spinneret.addAverageSubject(subject.getAverageSubject(), subject.getCoefficient());
				this.myIHM.displaySubjectAverage(subject);
			}
		
	}

	private void inputMarks(Subject subject) 
	{
		boolean continueInput = true;
		while (continueInput) 
		{
			this.myIHM.displaySubject(subject);
			subject.addMark(this.myIHM.entryMark(),this.myIHM.entryCoef());
			continueInput = this.myIHM.askContinue();
		}
	}

	public void start() {
		int choice = this.myIHM.menu();
		if (choice==1){
			this.addMarks();
		}
		if (choice==2){
			this.calculateAverage();
		}
		if (choice ==3){
			System.exit(0);
		}
		else 
			this.start();
		
	}
}

