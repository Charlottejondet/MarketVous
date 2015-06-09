package MarkEtVous.view.gui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import MarkEtVous.model.Mark;
import MarkEtVous.model.Spinneret;
import MarkEtVous.model.SpinneretType;
import MarkEtVous.model.Subject;
import MarkEtVous.view.IHM;

public class InterfaceIHM implements IHM {

	@Override
	public float entryMark() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Spinneret inputSpinneret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float entryCoef() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayListOfMarks(ArrayList<Mark> listOfMark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean askContinue() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void displayListOfMarksWithSubjects(ArrayList<Subject> listOfSubject) {
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

	@Override
	public void displayListOfMarks(List<Mark> listOfMark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayListOfMarksWithSubjects(List<Subject> listOfSubject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File inputSemester(SpinneretType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpinneretType inputTitleSpinneret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displaySubject(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displaySubjectAverage(Subject subject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGeneralAverage(Spinneret spinneret) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int menu() {
		// TODO Auto-generated method stub
		return 0;
	}

}
