import java.util.Scanner;

import se.lth.cs.pt.maze.Maze;
import se.lth.cs.pt.window.SimpleWindow;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Maze do you want? - Choose from 1 to 5");
		int mazeNum = sc.nextInt();
		Maze m = new Maze(mazeNum);
		
		System.out.println("How fast do you want your turtle? - 1 to 500, smaller numbers are faster");
		int speed = sc.nextInt();
		
		SimpleWindow w = new SimpleWindow(600,600, "Maze");
		
		//draws maze
		m.draw(w);
		
		
		Turtle turtle = new Turtle(w, m.getXEntry(), m.getYEntry());
		
		System.out.println("Starting in 3: ");
		for(int i = 2; i >= 0; i--) {
			SimpleWindow.delay(1000);
			System.out.println(i);
		}
		System.out.println("GO!");
		MazeWalker walker = new MazeWalker(turtle, speed);	
		
		
		
		//walks the maze
		walker.walkTwo(m);
		
	}

}
