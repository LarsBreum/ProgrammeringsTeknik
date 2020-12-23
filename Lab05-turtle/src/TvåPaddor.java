import java.util.Random;
import se.lth.cs.pt.window.SimpleWindow;

public class TvåPaddor {
	public static void main(String[] args) {

		
		Random rand = new Random();
		SimpleWindow w = new SimpleWindow(600,600, "TwoTurtles");
		
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 250);
		
		//tar reda på avståndet mellan de två turtles
		double dist = Math.sqrt(Math.pow(t1.getX()-t2.getX(), 2) + Math.pow(t1.getY()-t2.getY(), 2));
		System.out.println(dist);
		
		t1.penDown();
		t2.penDown();
		
		
		while (dist >= 50) {
			dist = Math.sqrt(Math.pow(t1.getX()-t2.getX(), 2) + Math.pow(t1.getY()-t2.getY(), 2));
			//turtle 2 ska ta ett steg med slumpmässigt längd (1-10)
			
			//turtle tar sitt steg
			t1.forward(steg(t1, rand));
			//rätning är slumpmässigt [-180 till 180]
			t1.left(dir(t1, rand));
			
			//turtle2 tar sitt steg
			t2.forward(steg(t2, rand));
			
			//turtle2 tar sitt steg
			t2.left(dir(t2, rand));
			
			System.out.println(dist);
			SimpleWindow.delay(10);
		}
		
		System.out.println("Dist >= 50");
		

	}
	public static int steg(Turtle t, Random rand) {
		//exempel på lokal variabel
		int steg;
		steg = rand.nextInt(9)+1;
		
		return steg;
	}
	public static int dir(Turtle t, Random rand) {
		int dir;
		dir = rand.nextInt((180 + 180) + 180);
		
		return dir;
	}

}
