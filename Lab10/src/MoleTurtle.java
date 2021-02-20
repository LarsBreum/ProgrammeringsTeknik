import java.util.Random;

public class MoleTurtle extends RaceTurtle {
	Random rand;
	
	MoleTurtle(RaceWindow w, int nbr) {
		super(w, nbr);
		rand = new Random();
	}
	//tar step
	void raceStep() {
		//if nextBoolean == true ska pennen ner, annars ska den upp
		if(rand.nextBoolean()){
			super.penDown();
		} else {
			super.penUp();
		}
		//anroper raceTurtles raceStep metod
		super.raceStep();
	}
	public String toString(){
		String print;
		print = super.toString() + " MoleTurtle";		
		return print;
	}
}
