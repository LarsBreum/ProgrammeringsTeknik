import java.util.ArrayList;
import java.util.Random;

public class TurtleRace {
	public static void main(String[] args) {
		RaceWindow w = new RaceWindow();
		ArrayList<RaceTurtle> turtles = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> placeMents = new ArrayList<RaceTurtle>();
		Random rand = new Random();
		
		int num = 0;
		for(int i = 1; i <= 8; i++) {
			num = rand.nextInt(3)+1;
			if(num == 1) {
				MoleTurtle t = new MoleTurtle(w, i);
				turtles.add(t);
			} else if (num == 2) {
				AbsentMindedTurtle t = new AbsentMindedTurtle(w, i);
				turtles.add(t);
			} else {
				DizzyTurtle t = new DizzyTurtle(w, i);
				turtles.add(t);
			}
		}
		
		for(RaceTurtle turtle : turtles) {
			System.out.println(turtle.toString());
		}
		
		RaceWindow.delay(10);
		System.out.println("Race Starts in");
		for(int i = 3; i >= 1; i--) {
			System.out.println(i);
			RaceWindow.delay(1000);
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
