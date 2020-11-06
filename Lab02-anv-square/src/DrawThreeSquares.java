import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		Square sq = new Square(250, 125, 100);
		sq.draw(w);
		sq = new Square(300,100,100);
		sq.draw(w);
		sq = new Square(225,150,100);
		sq.draw(w);
	}
}
