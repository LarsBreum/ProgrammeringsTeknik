package memory;
import java.util.Random;


public class MemoryBoard {
	int size;
	String backFileName;
	String[] frontFileNames;
	MemoryCardImage[][] board;
	Random rand;
	Boolean[][] cardUp;
	/** Skapar ett memorybräde med size * size kort. backFileName är filnamnet 
	    för filen med baksidesbilden. Vektorn frontFileNames innehåller filnamnen 
	    för frontbilderna. */
	public MemoryBoard(int size, String backFileName, String[] frontFileNames) {
		this.size = size;
		this.backFileName = backFileName;
		this.frontFileNames = frontFileNames;
		this.board = new MemoryCardImage[size][size];
		this.rand = new Random();
		this.cardUp = new Boolean[size][size];
		
		//anropar createCards();
		createCards(backFileName, frontFileNames, cardUp);
	}

	/* Skapar size * size / 2 st memorykortbilder.
	   Placerar ut varje kort på två slumpmässiga ställen på spelplanen. */
	private void createCards(String backFileName, String[] frontFileNames, Boolean[][] cardUp) {
		int i = 0;
		for(Boolean[] row : cardUp) { //all cards must start with face down E.G: false
			for (int i2 = 0; i2 <= row.length-1; i2++) {
				row[i2] = false;
			}
		}
		MemoryCardImage[] cards = new MemoryCardImage[size*2];
		for(String front : frontFileNames) { 
			cards[i] = new MemoryCardImage(front, backFileName); //skapar kartan
			i++;
		}
		shuffleBoard(cards);
	}

	/** Tar reda på brädets storlek. */
	public int getSize() {
		return size;
	}
	
	/** Hämtar den tvåsidiga bilden av kortet på rad r, kolonn c.
	    Raderna och kolonnerna numreras från 0 och uppåt. */
	public MemoryCardImage getCard(int r, int c) {
		return board[r][c];
	}

	/** Vänder kortet på rad r, kolonn c. */
	public void turnCard(int r, int c) {
		if(cardUp[r][c] == false) {
			cardUp[r][c] = true;
		} else if(cardUp[r][c] == true) {
			cardUp[r][c] = false;
		}
	}
	
	/** Returnerar true om kortet r, c har framsidan upp. */
	public boolean frontUp(int r, int c) {
		Boolean up = false;
		
		if(cardUp[r][c] == true) {
			up = true;
		}
		
		return up;
	}
	
	/** Returnerar true om det är samma kort på rad r1, kolonn c2 som på rad r2, 
	    kolonn c2. */
	public boolean same(int r1, int c1, int r2, int c2) {
		Boolean same = false;
		if(board[r1][c1] == board[r2][c2]) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}

	/** Returnerar true om alla kort har framsidan upp. */
	public boolean hasWon() {
		Boolean allUp = false;
		int ups = 0;
		for(Boolean[] row : cardUp) {
			for(Boolean card : row) {
				if(card == false) {
					allUp = false;
					break;
				} else {
					ups++;
				}
			}
		}
		if(ups == size*size) { //om det finns lika många uppa som storleken på brädet har man vunnit.
			allUp = true;					// Det känns lite oelegant att lösa det så, men det funkar.
		}	
		return allUp;
	}	
	/*shuffles the board*/
	public void shuffleBoard(MemoryCardImage[] cards) {
		int r = 0;
		int c = 0;
		Boolean[][] cardPlaced = new Boolean[size][size]; //array. Controls if a card has been placed
		for(Boolean[] row : cardPlaced) {
			for(int i1 = 0; i1 <= row.length-1; i1++) {
				row[i1] = false; //Sätter hela array till false
			}
		}
		for(MemoryCardImage card : cards) { //för varje kart i deck
			for(int k = 0; k < 2; k++) { //två referenser
				do { //Pick a row and a column to the cards
					r = rand.nextInt(size);
					c = rand.nextInt(size);
				} while (cardPlaced[r][c] == true); //if a card has been placed there before, pick new r and c
				cardPlaced[r][c] = true;
				board[r][c] = card;
			}
		}
	}

	

	
	/*resets board. For example to start new game 
	public void resetBoard(MemoryBoard board){
		
		int i = 0;
		MemoryCardImage[] cards = new MemoryCardImage[size*2];
		for (MemoryBoard[] row : board) { //takes the board and turns it to an array of the cards
			for(MemoryBoard card : row) {
				//if the card is not equal to any other card in the array, add it
				for(MemoryCardImage image : cards) {
					if(image != card) {
						cards[i] = card;
						i++;
					}
				}
			}
		}
		shuffleBoard(cards);
	}*/
}
