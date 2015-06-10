package MarkEtVous.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jondet Guezel Coste Litzenburger
 *
 */
public class SubjectOfSpinneret

{
	/**
	 * File of spinneret type
	 */
	private final File typeOfSpinneret;

	/**
	 * Constructor of subjectOfSpinneret
	 * @param type
	 */
	public SubjectOfSpinneret(File type) 
	{
		this.typeOfSpinneret=type; 
	}
	
	/**
	 * List of subject wich read files of subjects for each spinneret and each semester
	 * @returnlist of subject
	 * @throws IOException
	 */
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
					String[] subject = subjects[index].split("%");
					String title = subject[0];
					String coef = subject[1];
					listOfSubjects.add(new Subject(title,Float.parseFloat(coef)));
				}
			}
			return listOfSubjects;
		}
	}
}
		

