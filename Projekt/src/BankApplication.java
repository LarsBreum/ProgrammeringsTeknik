import java.util.ArrayList;
import java.util.Scanner;


public class BankApplication {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		
		while (true) {
			int choice = menu(scan);
			
			if(choice == 1) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 2) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 3) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 4) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 5) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if (choice == 6) {
				
				/*
				 * När konton skapas ska en customer skapas som input till den nya konton
				 * Först ska det kollas om kunden redan finns
				 */
				
				System.out.println("ADD ACCOUNT. Write you name");
				
				String name = "";
				long idNbr = 0;
				scan.nextLine();
				while(name.isEmpty() ){
					name = scan.nextLine();
					if(name.isEmpty()) {
						System.out.println("Name can not be empty. Write your name");
					}
				}
				
				System.out.println("Write your ID: ");
				while(idNbr == 0) {
					idNbr = scan.nextLong();
					if(idNbr == 0) {
						System.out.println("Id can not be either empty or 0. Write your ID");
					}
				}
				
			  	
				System.out.print("You added an account with the following account number: ");
				Customer c = new Customer(name, idNbr);
				System.out.println(bank.addAccount(c.getName(), c.getIdNbr()));
				
				
				
	
			} else if (choice == 7) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
				
			} else if (choice == 8) {
				
				
				for(BankAccount account : bank.getAllAccounts()) {
					System.out.println(account.toString());
				}
				
			} else if (choice == 9) {
				System.out.println("You chose " + choice + ". This has not been implemented yet");
			}
		}
			
	}
	
	/*
	 * Runs the menu options
	 */
	static int menu(Scanner scan) {
		String[] menu = {"Find Account by Owner", "Search for owner by name", "Deposit",
		            "Withdraw", "Transfer", "Create Account", "Delete Account",
		            "Print List of All Accounts", "End Session"};
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i+1 + ": " + menu[i]);
		}
			
		int choice = scan.nextInt();
		
		return choice;
	}

}
