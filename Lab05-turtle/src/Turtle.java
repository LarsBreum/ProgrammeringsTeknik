import se.lth.cs.pt.window.SimpleWindow;

public class Turtle {
	
	/*Deklarar attributter*/
	
	//Om pennan är nere
	boolean penDown;
	
	//Turtles positioner
	double xPos;
	double yPos;
	
	//Riktning i grader
	final int north = 90;
	int dir;
	
	//Simplewindow
	SimpleWindow win;
	
	
	/** Skapar en sköldpadda som ritar i ritfönstret w. Från början 
	    befinner sig sköldpaddan i punkten x, y med pennan lyft och 
	    huvudet pekande rakt uppåt i fönstret (i negativ y-riktning). */
	public Turtle(SimpleWindow w, int x, int y) {
		
		//Börjar med pennan uppa
		penDown = false;
		
		//Koordinaterna sätts
		xPos = x;
		yPos = y;
		
		//90 grader (norr)
		dir = north;
		
		//Simplewindow
		win = w;
	}

	/** Sänker pennan. */
	public void penDown() {
		penDown = true;
		//Använder Math.ceil till att omräkna från double till int
		win.moveTo((int)Math.ceil(xPos),(int)Math.ceil(yPos));
	}
	
	/** Lyfter pennan. */
	public void penUp() {
		penDown = false;
	}
	
	/** Går rakt framåt n pixlar i den riktningen huvudet pekar. */
	public void forward(int n) {
		
		win.moveTo((int) xPos, (int) yPos);
		
		xPos = xPos + n * Math.cos(Math.toRadians(-dir));
		yPos = yPos + n * Math.sin(Math.toRadians(-dir));
		
		
		if(penDown){
			win.lineTo( (int) xPos, (int) yPos );
		}
		
	} 

	/** Vrider beta grader åt vänster runt pennan. */
	public void left(int beta) {
		dir = dir + beta;
	}
	

	/** Går till punkten newX, newY utan att rita. Pennans läge (sänkt
	    eller lyft) och huvudets riktning påverkas inte. */
	public void jumpTo(int newX, int newY) {
		xPos = newX;
		yPos = newY;
	}

	/** Återställer huvudriktningen till den ursprungliga. */
	public void turnNorth() {
		dir = north;
	}

	/** Tar reda på x-koordinaten för sköldpaddans aktuella position. */
	public int getX() {
		return ((int) Math.round(xPos));
	}

 	/** Tar reda på y-koordinaten för sköldpaddans aktuella position. */
	public int getY() {
		return ((int) Math.round(yPos));
	}
  
	/** Tar reda på sköldpaddans riktning, i grader från den positiva X-axeln. */
 	public int getDirection() {
 		return (dir);
	}
}
