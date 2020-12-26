import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;


public class MazeWalker {
	private Turtle turtle;
	private boolean wallAtLeft;
	private boolean wallInFront;
	private int steps;
	private int delay;
	
	public MazeWalker(Turtle turtle, int delay){
		this.turtle = turtle;
		wallAtLeft = false;
		wallInFront = false;
		this.delay = delay;
	}
	
	public void walk(Maze maze) {
		turtle.penDown();
		wallAtLeft = maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY());
		wallInFront = maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY());
		
		//Om en väg finns till vänster - gå framåt
		while(wallAtLeft == true && wallInFront == false) {
			turtle.forward(1);
			
			wallAtLeft = maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY());
			wallInFront = maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY());
			
			//Hantera wallAtLeft == false
			if(wallAtLeft == false) {
				turtle.left(90);
				turtle.forward(1);
				steps++;
				if(maze.wallAtLeft(turtle.getDirection(), turtle.getX(), turtle.getY())) {
					wallAtLeft = true;
				}
			}
			
			//Hantera om en vägg finns framför, och till vänster
			if(wallInFront == true && wallAtLeft == true) {
				turtle.left(-90);
				
				//Om sköldpaddan är i ett hörn måste den svänga till det inte finns en vägg framför
				while(maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY())){
					turtle.left(-90);
				}
				
				turtle.forward(1);
				steps++;
				if(maze.wallInFront(turtle.getDirection(), turtle.getX(), turtle.getY()) == false) {
					wallInFront = false;
				}
			}
		
			if(maze.atExit(turtle.getX(), turtle.getY())) {
				System.out.println("MAZE DONE");
				System.out.println("You did it in: " + steps + " steps");
				if(steps > 1000) {
					System.out.println("WOW! Your turtle is in really good shape!");
				}
				break;
			}
		steps++;
		SimpleWindow.delay(delay);				
		}
		
	}

}
