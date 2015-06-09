package MarkEtVous.view.console;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MarkEtVous.model.Mark;
import MarkEtVous.model.Spinneret;
import MarkEtVous.model.Subject;
import MarkEtVous.model.SpinneretType;
import MarkEtVous.view.IHM;

public class ConsoleIHM implements IHM
{
	private Scanner coe;
	private Scanner sc;
	private int value;

	public boolean isNumeric(String string){
		try {
			value = Integer.parseInt(string);
			
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
		try {
			float str = coe.nextFloat();
			return str;
		} catch (Exception e) {
			return entryCoef();
		}
		
	}

	@Override
	public float entryMark() 
	{
		sc = new Scanner(System.in);
		System.out.println("entrez la note");
		try {
			float str = sc.nextFloat();
			return str;
		} catch (Exception e){
			return entryMark();
		}		
	}

	@Override
	public void displayListOfMarks(List<Mark> listOfMark) 
	{
		System.out.println("Notes rentr�es : ");
		for (Mark currentMark : listOfMark){
			System.out.println(currentMark.getMark()+" ("+currentMark.getCoefficient()+")\n ");
		}
		
	}


	@Override
	public boolean askContinue() 
	{
		sc = new Scanner (System.in);
		System.out.println("Voulez-vous continuer � rentrer les notes pour cette mati�re ?");
		System.out.println(" 1 : Oui \n 2 : Non \n");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int type = Integer.parseInt(string);
		if (type==1)
		{
			return true;
		}
		else if (type==2)
		{
			return false;
		}
		return askContinue();

	}


	@Override
	public void displayListOfMarksWithSubjects(List<Subject> listOfSubject) 
	{
		for (Subject currentSubject : listOfSubject){
			System.out.println(currentSubject.getSubjectname()+" : ");
			for (Mark currentMark : currentSubject.getListOfMark()) {
				System.out.println(currentMark.getMark()+" ("+currentMark.getCoefficient()+"); ");
			}
		}
		
		
	}


	@Override
	public boolean validateCalculation() {
		sc = new Scanner (System.in);
		System.out.println("Voulez-vous calculer les moyennes de chaque mati�re ?");
		System.out.println(" 1 : Oui \n 2 : Non ");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int choice = Integer.parseInt(string);
		if (choice==1)
		{
			return true;
		}
		if (choice==2)
			return false;
		return this.validateCalculation();
	}


	@Override
	public void displaySummaryOfAverage() {

		
		
	}



	@Override
	public File inputSemester(SpinneretType type) {
		sc = new Scanner (System.in);
		System.out.println(" 1 : semestre 1 \n 2 : semestre 2 \n 3 : semestre 3 \n 4 : semestre 4 \n ");
		System.out.println("Choississez votre semestre");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int semester = Integer.parseInt(string);
		if (semester==1)
		{
			return new File (type.toString()+"1.txt");
		}
		else if (semester==2)
		{
			return new File (type.toString()+"2.txt");
		}
		else if (semester==3)
		{
			return new File (type.toString()+"3.txt");
		}
		else if (semester==4)
		{
			return new File (type.toString()+"4.txt");
		}
		return this.inputSemester(type);
	}



	@Override
	public SpinneretType inputTitleSpinneret() {
		sc = new Scanner (System.in);
		System.out.println(" 1 : INFO\n 2 : GEA\n 3 : TC \n 4 : RT \n ");
		System.out.println("Choississez votre fili�re");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int type = Integer.parseInt(string);
		if (type==1)
		{
			return SpinneretType.INFO;
		}
		else if (type==2)
		{
			return SpinneretType.GEA;
		}
		else if (type==3)
		{
			return SpinneretType.TC;
		}
		else if (type==4)
		{
			return SpinneretType.RT;
		}
		return inputTitleSpinneret();
	}



	@Override
	public void displaySubject(Subject subject) {
		System.out.println(subject.getSubjectname()+" : ");
		
	}



	@Override
	public void displaySubjectAverage(Subject subject) {
		System.out.println(subject.getSubjectname()+ " :");
		System.out.println(subject.getAverageSubject());
		
	}



	@Override
	public void displayGeneralAverage(Spinneret spinneret) {
		System.out.println("Moyenne g�n�rale");
		System.out.println(spinneret.getGeneralAverage());
		
	}



	@Override
	public int menu() {
		sc = new Scanner (System.in);
		System.out.println("Que voulez vous faire ?");
		System.out.println(" 1 : Ajouter les notes \n 2 : Calculer les moyennes  \n 3 : Quitter");
		String string ="";
		do {
			string = sc.nextLine();
		} while (!this.isNumeric(string));
		int choice = Integer.parseInt(string);
		if (choice <4 && choice >0) {
			return choice;
		}
		return this.menu();
	}
	
	

}
