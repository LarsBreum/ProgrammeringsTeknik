import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class SquareAnimation {
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

			// draw 10 squares between old click and new click
			for (int i = 1; i < 11; i++) {
				// radera gamla fyrkant
				sq.erase(w);
				int xi = i * ((x - xOld) / 10) + xOld;
				int yi = i * ((y - yOld) / 10) + yOld;
				sq = new Square(xi, yi, 100);
				sq.draw(w);

				// delay mellan nya fyrkant
				SimpleWindow.delay(10);
			}

			// Make old coordinates to the latest coordinates
			xOld = x;
			yOld = y;
		}

	}

	public static double calcDistance(int x, int y) {
		double dist = Math.sqrt(x * x + y * y);
		return (dist);
	}
}
