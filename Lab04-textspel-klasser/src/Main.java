import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Player pl1 = new Player(pickCha(sc));
		
		System.out.println("You are now ready for your first fight. The enemy is approaching!");
		Enemy en1 = new Enemy();
		
		fight(en1, pl1, sc);
		
		
	}
	public static int pickCha(Scanner sc){
			int pick = 0;
			System.out.println("Choose your caracter");
			System.out.println("Press 1 for: Troll");
			System.out.println("Press 2 for: Man");
			System.out.println("Press 3 for: Elf");
			
			do {
				while(!sc.hasNextInt()){
					System.out.println("That's not a number");
					sc.next();
					
				}
				pick = sc.nextInt();
				if (pick < 0 || pick > 3) {
					System.out.println("You can only choose between those three characters - try again");
				}
			} while(pick < 0 || pick > 3);
			
			if (pick == 1) {
				System.out.println("You chose the Troll! Trolls have a lot of health, " +
						"are really strong, but are bad fighters");
			} else if (pick == 2) {
				System.out.println("You chose the Man! Men are decently strong and have decent health," +
						" and are decent fighters");
			} else if (pick == 3) {
				System.out.println("You chose the Elf! Elfs have low health, and are fairly weak " +
						"but are really good fighters.");
			}
			
			return(pick);
	}
	public static void fight(Enemy en, Player pl, Scanner sc){
		Random rand = new Random();
		
		int plAttack = 0;
		int plSkill = pl.getSkill();
		int plHealth = pl.getHealth();
		int plStrength = pl.getStrength();
		
		int enAttack = 0;
		int enSkill = en.getSkill();
		int enHealth = en.getHealth();
		int enStrength = en.getStrength();
		
		
		
		do {
			System.out.println("You can attack - enter any character to attack");
			sc.next();
			wait(2);
				plAttack = rand.nextInt(100);
				System.out.println("plAttack: " + plAttack);
				if (plAttack >= enSkill && plAttack >= 90) {
					System.out.println("You got a critical hit!");
					enHealth = enHealth - plStrength*plAttack*10;
					System.out.println("The enemy has " + enHealth + " health left");
				} else if (plAttack >= enSkill) {
					enHealth = enHealth - plStrength*plAttack;
					System.out.println("You did " + plStrength*plAttack + " damage");
				} else if (plAttack <= 5){
					System.out.println("You hit yourself...");
					plHealth = plHealth - 5;
				}
				else {
					System.out.println("Sorry you missed...");
				}
				System.out.println("The enemy has " + enHealth + " health left");
				wait(1);
				
				//Checks if enemy is dead, break out of loop
				if(enHealth < 0) {
					System.out.println("You WON!...");
					break;
				}
				
				
				System.out.println("The enemy will attack you now!");
				
				wait(2);
				
				enAttack = rand.nextInt(100);
				if (enAttack >= plSkill) {
					System.out.println("You got hit!");
					plHealth = plHealth - enStrength*enAttack;
					System.out.println("You have " + plHealth + " health left");
				} else {
					wait(2);
					System.out.println("You blocked the attack!");
				}
				
			//Checks if pl is dead, break out of loop
			if (plHealth < 0) {
				System.out.println("You died...");
				break;
			}
		} while(true);
		
		
	}
	
	//Create a delay to make game more tense
	public static void wait(int s){
		try {
			TimeUnit.SECONDS.sleep(s);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
