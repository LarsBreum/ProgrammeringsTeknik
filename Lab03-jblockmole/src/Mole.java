

public class Mole {
	public final int worldWidth = 70;
	public final int worldHeight = 50;
	public final int blockSize = 10;
	public final int groundHeight = 35;
	public final int grassHeight = 2;
	int points;
	public Graphics g = new Graphics(worldWidth, worldHeight, blockSize);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mole fluffy = new Mole();
		fluffy.drawWorld();
		fluffy.dig();
		
		
	}
	
	public void drawWorld(){
		g.rectangle(0, 0, worldWidth,worldHeight-groundHeight, Colors.SKY);
		g.rectangle(0, worldHeight-groundHeight, worldWidth,grassHeight, Colors.GRASS);
		g.rectangle(0, worldHeight-groundHeight+grassHeight, worldWidth, groundHeight, Colors.SOIL);
	}
	
	public void dig(){
		int x = g.getWidth() / 2; // För att börja på mitten
		int y = g.getHeight() / 2;
		
		g.block(x,y, Colors.MOLE);
		
		while (true) {
			if (y>=worldHeight-groundHeight-grassHeight+1 && y<=worldHeight-groundHeight+1){
				System.out.println("i grässet");
				g.block(x, y, Colors.GRASS);
			} else {
				System.out.println("i jorden");
				g.block(x,y, Colors.TUNNEL);
			}
			
			char key = g.waitForKey();
			
			
			g.block(x,y, Colors.MOLE);
			
			
			if (key == 'w') { y--; }
			else if (key == 'a') { x--; }
			else if (key == 's') { y++; }
			else if (key == 'd') { x++; }
			if (y<=worldHeight-groundHeight){
				y=worldHeight-groundHeight;
			} else if (y>=worldHeight-1) {
				y=worldHeight-1;
			} else if (x<worldWidth-worldWidth) {
				x=worldWidth;
			} else if (x>worldWidth) {
				x=0;
			}
		}
	}
	

}
