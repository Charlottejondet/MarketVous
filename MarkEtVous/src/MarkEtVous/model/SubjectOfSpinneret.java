package MarkEtVous.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubjectOfSpinneret

{
	private final File typeOfSpinneret;

	public SubjectOfSpinneret(File type) 
	{
		this.typeOfSpinneret=type; 
	}
	
	public List<Subject> readSubjects() throws IOException{
		
		List<Subject> listOfSubjects = new ArrayList<Subject>();
		try (BufferedReader entry = new BufferedReader(new FileReader(this.typeOfSpinneret)))
		{
			String readText = entry.readLine();
			if (readText != null)
			{
				String[] subjects = readText.split("/");
				for (int index = 0; index < subjects.length; index++)
				{
					String[] subject = subjects[index].split(",");
					String title = subject[0];
					String coef = subject[1];
					listOfSubjects.add(new Subject(title,Float.parseFloat(coef)));
				}
			}
			return listOfSubjects;
		}
	}
}
		

