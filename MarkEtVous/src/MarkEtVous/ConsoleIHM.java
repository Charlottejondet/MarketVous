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
		sc = new Scanner(System.in);
		System.out.println(" 1 : INFO\n 2 : GEA\n 3 : TC \n 4 : RT \n ");
		System.out.println("Choississez votre filière");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int type = Integer.parseInt(string);
		if (type==1)
		{
			return new Spinneret(spinneretType.INFO);
		}
		else if (type==2)
		{
			return new Spinneret(spinneretType.GEA);
		}
		else if (type==3)
		{
			return new Spinneret(spinneretType.TC);
		}
		else if (type==4)
		{
			return new Spinneret(spinneretType.RT);
		}
		return inputSpinneret();
				
	}
		


	public boolean isNumeric(String string){
		try {
			int value = Integer.parseInt(string);
			
		} catch (Exception e) {
			return false;
		}
		return true;
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