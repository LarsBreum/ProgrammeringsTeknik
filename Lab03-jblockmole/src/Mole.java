

public class Mole {
	Graphics g = new Graphics(30, 50, 10);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mole fluffy = new Mole();
		fluffy.drawWorld();
		
	}
	
	public void drawWorld(){
		g.rectangle(0, 0, 30, 50, Colors.SOIL);
	}

}
