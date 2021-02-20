import java.util.Random;
public class DizzyTurtle extends RaceTurtle {
	
	int dizzy;
	Random rand;
	int beta;
	
	DizzyTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
		rand = new Random();
		dizzy = rand.nextInt(5)+1;
		//omräknar dizzy till en vinkel
		beta = 1*dizzy; //kan max svänga 1*dizzy degrees
	}
	
	void raceStep() {
		//Slump boolean. om true svänga mot höger, om false svänger mot vänster
		Boolean rl = rand.nextBoolean();
		if(rl) {
			super.left(beta);
		} else {
			super.left(-beta);
		}
		super.raceStep();	
	}
	public String toString(){
		String print;
		print = super.toString() + " DizzyTurtle (Yrsel: " + dizzy + ")";		
		return print;
	}

}
