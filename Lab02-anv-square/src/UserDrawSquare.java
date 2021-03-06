import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class UserDrawSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "UserDrawSquare");
		int xOld = 0;
		int yOld = 0;
		Square sq = new Square(xOld, yOld, 100);
		sq.draw(w);
		
		while (true) {
			w.waitForMouseClick();
			int x = w.getClickedX();
			int y = w.getClickedY();
			int xDist = Math.abs(xOld - x);
			int yDist = Math.abs(yOld - y);
			System.out.println("xDist: " + xDist + " yDist: " + yDist);
			
			//draw square at pointed clicked
			sq = new Square(x,y,100);
			sq.draw(w);
			
			//draw 9 squares between old click and new click
			for (int i = 1; i < 10; i++) {
				sq = new Square(i*((x-xOld)/10)+xOld, i*((y-yOld)/10)+yOld, 100);
				sq.draw(w);
			}
			
		//Make old coordinates to the latest coordinates
		xOld = x;
		yOld = y;
		}
		
	}
	public static double calcDistance (int x, int y){
		double dist = Math.sqrt(x * x + y * y);
		return(dist);
	}
}
