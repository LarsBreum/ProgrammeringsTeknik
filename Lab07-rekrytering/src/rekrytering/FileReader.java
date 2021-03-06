package rekrytering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	/**
	 * Returnerar max nbrOfRows rader från filen som en vektor av Applicant-objekt.
	 * Läser i filen tills det inte finns fler rader eller tills man läst nbrOfRows
	 * rader (det som inträffar först). 
	 * Returnerar null om filen inte finns.
	 */
	public static Applicant[] readFromFile(String fileName, int nbrOfRows) {
		Scanner scan;
		try {
			scan = new Scanner(new File(fileName), "utf-8");
		} catch (FileNotFoundException e) {
			System.err.println("File not found" + fileName);
			e.printStackTrace();
			return null;
		}
		
		
		//Här kan du använda Scannern för att läsa från filen fileName.
		String line = null;
		String[] applicant = null;
		String name = null;
		String grades = null;
		//håller applicants, men om nbrOfRows > rader i filen får den många tomma rader
		Applicant[] tempApplicants = new Applicant[nbrOfRows]; 
		
		int i = 0;
		int rad = 1;
		while (scan.hasNextLine() && i < nbrOfRows) {
			//Hämtar en rad
			line = scan.nextLine();
			//Kollar att raden kan änvändas
			if(line.trim().isEmpty() == false || line.trim().length() > 0) {
				//insätter en rad i en applicant vektor
				applicant = line.split(" ");
				//Tar namnet ur vektorn
				name = applicant[0] + " " + applicant[1];
				//Tar grades ur vektorn
				grades = applicant[2];
				//skapar applicant objektet i applicant vektorn
				tempApplicants[i] = new Applicant(name, grades);
				//ökar endast i om raden kan används
				i++;
			} else { //Kan används till debugging
				System.out.println("rad " + rad + " är tom");
			}
			rad++;
		}
		//Säkerställer att applicants[] har den rätta längd (samma antal rader som filens längd)
		Applicant[] applicants = new Applicant[i]; //i = antal rader
		for(int n = 0; n <= applicants.length-1; n++) {
			applicants[n] = tempApplicants[n];
		}
		
		//Varje rad motsvarar en Applicant. Kontrollera vad Applicants konstruktor kräver
		//Alla Applicant-objekt (max nbrOfRows stycken) ska lagras i en Applicant-vektor och returneras på slutet
		return applicants; //Byt ut denna rad mot hela lösningen
	}
}
