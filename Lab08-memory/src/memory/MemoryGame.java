package memory;

import javax.swing.JOptionPane;

import se.lth.cs.pt.window.SimpleWindow;

public class MemoryGame {
	public static void main(String[] args) {
		String[] frontFileNames = {"can.jpg", "flopsy_mopsy_cottontail.jpg",
				"friends.jpg", "mother_ladybird.jpg", "mr_mcgregor.jpg",
				"mrs_rabbit.jpg", "mrs_tittlemouse.jpg", "radishes.jpg" };
		
		// Fyll i egen kod här
		final int size = 4;
		drawWindow(frontFileNames, size);
		
			
	}
	public static void drawWindow(String[] frontFileNames, int size) {
		MemoryBoard board = new MemoryBoard(size, "back.jpg", frontFileNames);
		MemoryWindow w = new MemoryWindow(board);
		w.clear();
		w.drawBoard();
		playGame(board, w, size);
	}
	public static void playGame(MemoryBoard board,MemoryWindow w, int size) {
		//Användar om det ett kart har ett match
		Boolean[][] hasMatch = new Boolean[size][size];
		int tries = 0;
		int r1 = 0;
		int c1 = 0;
		int r2 = 0;
		int c2 = 0;
		
		do {
			while(true) {
				w.waitForMouseClick();
				r1 = w.getMouseRow();
				c1 = w.getMouseCol();
				if (board.frontUp(r1, c1) == false) {
					board.turnCard(r1, c1);
					w.drawCard(r1, c1);
					break;
				}
			}
			
			while(true){
				w.waitForMouseClick();
				r2 = w.getMouseRow();
				c2 = w.getMouseCol();
				if(board.frontUp(r2, c2) == false) {
					board.turnCard(r2, c2);
					w.drawCard(r2, c2);
					break;
				}
			}
			
			tries++;
			System.out.println(tries);
			
			if(board.same(r1, c1, r2, c2) == false) {
				SimpleWindow.delay(1000);
				board.turnCard(r1, c1);
				board.turnCard(r2, c2);
				w.drawCard(r1, c1);
				w.drawCard(r2, c2);
			} else {
				hasMatch[r1][c1] = true;
				hasMatch[r2][c2] = true;
			}
		} while (board.hasWon() == false);
		System.out.println("YOU WON!");
		JOptionPane.showMessageDialog(null,
				"You had " + Integer.toString(tries) +
				" Tries - Click the screen to play agian", "Tries",
				JOptionPane.INFORMATION_MESSAGE);
		w.waitForMouseClick();
		
	}
}
