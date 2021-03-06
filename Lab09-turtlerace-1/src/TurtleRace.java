import java.util.ArrayList;


public class TurtleRace {
	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();
		ArrayList<RaceTurtle> turtles = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> placeMents = new ArrayList<RaceTurtle>();
		
		for(int i = 1; i <= 8; i++) {
			RaceTurtle t = new RaceTurtle(w, i);
			turtles.add(t);
		}
		
		while(placeMents.size() < 8) {
			for(int i = 0; i <= turtles.size()-1; i++) {
				turtles.get(i).raceStep();
				if(turtles.get(i).getX() >= RaceWindow.X_END_POS) {
					placeMents.add(turtles.get(i));
					turtles.remove(turtles.get(i));
				}
			}
			RaceWindow.delay(10);
		}
		for(int i = 1; i <= 3; i++) {
			System.out.println("På Plats: " + " " +  i + " " + placeMents.get(i).toString());
		}
	}

}
