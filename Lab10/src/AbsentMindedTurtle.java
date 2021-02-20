import java.util.Random;

public class AbsentMindedTurtle extends RaceTurtle {
	
	int absent;
	Random rand;
	
	AbsentMindedTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
		rand = new Random();
		absent = rand.nextInt(100);
	}

	void raceStep(){
		//Slumpar ett tal - om det är större tar den sitt steg
		if(rand.nextInt(100) >= absent) {
			super.raceStep();
		}
	}
	public String toString(){
		String print;
		print = super.toString() + " AbsentMindedTurtle (" + absent + "%) frånvarande";		
		return print;
	}
}
