package MarkEtVous;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleIHM implements IHM
{


	private Scanner coe;
	private Scanner sc;


	@Override
	public Spinneret inputSpinneret() 
	{
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public float entryCoef() 
	{
		coe = new Scanner(System.in);
		System.out.println("entrez le coefficient de la note");
		float str = coe.nextFloat();
		return str;
	}

	@Override
	public float entryMark() 
	{
		sc = new Scanner(System.in);
		System.out.println("entrez la note");
		float str = sc.nextFloat();
		return str;
	}

	@Override
	public void displayListOfMarks(ArrayList<Mark> listOfMark) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean askContinue() 
	{
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean validateCalculation() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void displaySummaryOfAverage() {
		// TODO Auto-generated method stub
		
	}
	
	

}