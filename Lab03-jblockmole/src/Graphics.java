import se.lth.cs.pt.window.SimpleWindow;

public class Graphics {
	
	private int width;
	private int height;
	private int blockSize;
	
	private SimpleWindow w;
	
	Graphics(int w, int h, int bs) {
		width = w;
		height = h;
		blockSize = bs;
		
		this.w = new SimpleWindow(width * blockSize,
								height * blockSize,
								"Digging");
	}
	
	public int getWidth(){
		return(width);
	}
	public int getHeight(){
		return(height);
	}
	
	public void rectangle(int x, int y, int width, int height, java.awt.Color c){
		for (int yy = y; yy < y + height; yy++){
			for(int xx = x; xx < x + width; xx++){
				block(xx, yy, c);
			}
		}
	}
	
	public void block(int x, int y, java.awt.Color color){
		int left = x * blockSize;
		int right = left + blockSize - 1;
		int top = y * blockSize;
		int bottom = top + blockSize - 1;
		for(int row = top; row <= bottom; row ++){
			w.moveTo(left, row);
			w.lineTo(right, row);
		}
		w.setLineColor(color);
	}
	
	public char waitForKey(){
		return w.waitForKey();
	}

}
