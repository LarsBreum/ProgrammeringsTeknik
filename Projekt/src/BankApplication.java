import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class BankApplication {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();

		
		
	//Add 3 accounts
		for(int i = 0; i < 3; i++) {
			System.out.print("You added an account with the following account number: ");
			System.out.println(bank.addAccount("Lars",1111));
		}
		//Add 3 accounts
		for(int i = 0; i < 3; i++) {
			System.out.print("You added an account with the following account number: ");
			System.out.println(bank.addAccount("Peter",1234));
		}
	//Add 2 accounts
		for(int i = 0; i < 3; i++) {
			System.out.print("You added an account with the following account number: ");
			System.out.println(bank.addAccount("Typo",1111));
		}
	//Add 3 accounts
		for(int i = 0; i < 3; i++) {
			System.out.print("You added an account with the following account number: ");
			System.out.println(bank.addAccount("Alice",1233));
		}
		
		while (true) {
			int choice = menu(scan);
			
			if(choice == 1) {
				System.out.println("Search for a customers account using his ID. Input the ID");
				ArrayList<BankAccount> accQuery = bank.findAccountsForHolder(inputId(scan));
				if(accQuery.isEmpty()) {
					System.out.println("The ID doesn't hold any accounts");
				} else {
					for(BankAccount account : accQuery){
						System.out.println(account);
					}
				}
				
			} else if(choice == 2) {
							
				String nameQuery = inputName(scan);
				ArrayList<Customer> accQuery = bank.findByPartOfName(nameQuery);
				
				for(Customer c : accQuery) {
					System.out.println(c);
				}
				
				
			} else if(choice == 3) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 4) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if(choice == 5) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
			} else if (choice == 6) {
				
				Customer c = new Customer(inputName(scan), inputId(scan));
				System.out.print("You added an account with the following account number: ");
				System.out.println(bank.addAccount(c.getName(), c.getIdNbr()));
				
				
				
		
			} else if (choice == 7) {
				System.out.println("You chose " + choice + " This has not been implemented yet");
				
			} else if (choice == 8) {
				
				
				for(BankAccount account : bank.getAllAccounts()) {
					System.out.println(account);
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
		String[] menu = {"Find Accounts by Owner's ID", "Search for owner by name", "Deposit",
		            "Withdraw", "Transfer", "Create Account", "Delete Account",
		            "Print List of All Accounts", "End Session"};
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i+1 + ": " + menu[i]);
		}
			
		int choice = scan.nextInt();
		
		return choice;
	}
	
	/*
	 * Gets name with the scanner
	 */
	static String inputName(Scanner scan) {
		
		System.out.println("ADD ACCOUNT. Write the name");
		
		String name = "";
		
		scan.nextLine();
		while(name.isEmpty() ){
			name = scan.nextLine();
			if(name.isEmpty()) {
				System.out.println("Input can not be empty. Write the name");
			}
		}
		
		return name;
	}
	static long inputId(Scanner scan) {
		long idNbr = 0;
		
		System.out.println("Write the ID: ");
		while(idNbr == 0) {
			idNbr = scan.nextLong();
			if(idNbr == 0) {
				System.out.println("Id can not be either empty or 0. Write the ID");
			}
		}
		return idNbr;
	}

}
