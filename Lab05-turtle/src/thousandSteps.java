import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;


public class thousandSteps {
	//En skölpadda tar 1000 steg
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "tuesenSteg");
		Turtle t = new Turtle(w, 300, 300);
		Random rand = new Random();
		System.out.println(101 % 100);
		
		int stegL;
		int dir;
		t.penDown();
		for (int i = 0; i < 1000; i++) {
			
			//turtle ska ta ett steg med slumpmässigt längd (1-10)
			stegL = rand.nextInt(9)+1;
			//turtle tar sitt steg
			t.forward(stegL);
			//rätning är slumpmässigt [-180 till 180]
			dir = rand.nextInt((180 + 180) + 180);
			t.left(dir);
			SimpleWindow.delay(10);
		}
		
		
		

	}

}
