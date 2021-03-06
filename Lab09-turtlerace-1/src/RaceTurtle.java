import java.util.Random;



public class RaceTurtle extends Turtle {
	Random rand;
	RaceWindow w;
	int nbr;
	
	//Skapar en RaceTurtle
	RaceTurtle(RaceWindow w, int nbr) {
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		this.rand = new Random();
		this.w = w;
		this.nbr = nbr;	
		penDown = true;
		dir = 0;
	}
	
	//Takes one step forward between one and 6 lengths
	void raceStep() {
		int step = rand.nextInt(6);
		forward(step);
	}
	
	//Prints the raceTurtle
	public String toString(){
		return "Nummer " + nbr;
	}

}
