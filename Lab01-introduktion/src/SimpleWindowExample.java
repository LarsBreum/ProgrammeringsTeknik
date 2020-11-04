import java.awt.Color;

import se.lth.cs.pt.window.SimpleWindow;




public class SimpleWindowExample {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "Drawing Window");
		
		w.setLineColor(Color.RED);
		w.moveTo(100, 100);
		w.lineTo(100, 200);
		
		w.setLineColor(Color.RED);
		w.moveTo(100, 200);
		w.lineTo(200, 200);
		
		w.setLineColor(Color.RED);
		w.moveTo(100, 100);
		w.lineTo(200, 100);
		
		w.setLineColor(Color.RED);
		w.moveTo(200, 100);
		w.lineTo(200, 200);
		
	}
}