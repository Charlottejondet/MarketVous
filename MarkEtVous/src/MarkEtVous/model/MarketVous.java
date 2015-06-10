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
			int index =0;
			for (index=0; index < this.spinneret.getListOfSubject().size();index++) 
			{
				Subject currentSubject = this.spinneret.getListOfSubject().get(index);
				if(!this.inputMarks(currentSubject))
					break;
				this.myIHM.displayListOfMarks(currentSubject.getListOfMark());	
					
			}
			if (index ==this.spinneret.getListOfSubject().size()) {
				this.myIHM.displayListOfMarksWithSubjects(this.spinneret.getListOfSubject());
				this.calculateAverage();
			}

		}
	}
		
	
	public void calculateAverage()
	{
		for (Subject currentSubject : this.spinneret.getListOfSubject()) 
		{
			this.calculateAverageSubject(currentSubject);						
		}
		
		this.calculateGeneralAverage();
		this.myIHM.displaySummaryOfAverage(this.spinneret);
		
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

	private boolean inputMarks(Subject subject) 
	{
		boolean continueInput = true;
		while (continueInput) 
		{
			this.myIHM.displaySubject(subject);
			Float mark = this.myIHM.entryMark(subject);
			if (mark.compareTo(new Float("0.0"))>0) {
				Float coef = this.myIHM.entryCoef();
				if (coef.compareTo(new Float("0.0"))>0){
					subject.addMark(mark,coef);
					continueInput = this.myIHM.askContinue();
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}

	public void start() {
		int choice = this.myIHM.menu();
		if (choice==1){
			this.addMarks();
		}
		if (choice==2){
			System.exit(0);
		}
		else 
			this.start();
		
	}
}

