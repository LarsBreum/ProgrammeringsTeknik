import se.lth.cs.pt.window.SimpleWindow;


public class Mole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleWindow w = new SimpleWindow(300, 500, "Digging");
		w.moveTo(10, 10);
		w.lineTo(10, 20);
		w.lineTo(20, 20);
		w.lineTo(20, 10);
		w.lineTo(10, 10);
		
		System.out.println("Keep Digging!");
	}

}
