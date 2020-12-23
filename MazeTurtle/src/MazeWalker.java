import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;




public class MazeWalker {
	private SimpleWindow w;
	Maze m;
	private Turtle turtle;
		
	public MazeWalker(Turtle turtle){
		w = new SimpleWindow(600,600, "Maze");
		m = new Maze(1);
		turtle = new Turtle(w, m.getXEntry(), m.getYEntry());
		
	}
	
	public void walk(Maze maze) {
		turtle.penDown();
		turtle.forward(1);
	}

}
