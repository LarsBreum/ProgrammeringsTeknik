package rekrytering;

import java.util.Arrays;
import java.util.Collections;

public class FindBestCandidates {
	private static final double MIN_AVG_GRADE = 4.0;
	private static final String fileName = "applications_all.txt";

	public static void main(String[] args) {
		Applicant[] applicants = null;
		// Läs från fil (Börja med "applications_small.txt), spara resultatet i en
		// vektor
		applicants = FileReader.readFromFile(fileName, 100);
		//Printer alla applicants
		for(int i = 0; i <= applicants.length-1; i++) {
			//System.out.println(applicants[i].toString());
		}
		// Skicka in Applicant-vektorn (som du fick i föregående steg) till metoden
		Applicant[] bestApplicants = findBestCandidates(applicants);		
		
		// findBestCandidiates (nedan)
		// Spara resultatet i en vektor

		// Printa resultatet från findBestCandidates
		System.out.println("De bästa kandidaterna från filen: " + fileName + " är:");
		for(int i = 0; i <= bestApplicants.length-1; i++) {
			Arrays.sort(bestApplicants, Collections.reverseOrder());
			System.out.println(i + ": " + bestApplicants[i].toString());
		}
	}

	public static Applicant[] findBestCandidates(Applicant[] applicants) {
		//Tar reda på hur många med betyg över krav
		int sum = 0;
		for(int i = 0; i <= applicants.length-1; i++) {
			if(applicants[i].getAvgGrade() >= MIN_AVG_GRADE) {
				sum += 1;
			}
		}
		Applicant[] candidates = new Applicant[sum];
		
		//Stoppar in de applicants med betyg över krav
		for(int i = 0; i <= applicants.length-1; i++) {
			if(applicants[i].getAvgGrade() >= MIN_AVG_GRADE) {
				for(int n = 0; n <= candidates.length-1; n++) {
					if(candidates[n] == null) {
						candidates[n] = applicants[i];
						break;
					} 
				}
			}
		}
	
		
		
		// Lagra alla dessa kandidater i en vektor, returnera vektorn
		return candidates; //Byt ut denna rad mot hela din egen lösning
	}
}
