import se.lth.cs.pt.window.SimpleWindow;

public class Graphics {
	
	private SimpleWindow w = new SimpleWindow(300, 500, "Digging");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		w.moveTo(10, 10);
		w.lineTo(10, 20);
		w.lineTo(20, 20);
		w.lineTo(20, 10);
		w.lineTo(10, 10);
		

	}

}
