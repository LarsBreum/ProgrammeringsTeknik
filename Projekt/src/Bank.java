import java.util.ArrayList;


public class Bank {
	
	/*
	 * Creates a new bank
	 * Needs:
	 * list of accounts
	 */

	ArrayList<BankAccount> accounts;
	
	Bank(){ //constructor
		this.accounts = new ArrayList<BankAccount>();
	}
	
	/*
	 * Open a new bank account. If the customer already exists 
	 * a new customer should not be added, but the account should be added to that customer
	 */
	int addAccount(String holderName, long idNbr) {
		
		return 1;
	}
	
	/*
	 * Returns customer with idNbr
	 */
	Customer findHolder(long idNbr) {
		return null;
	}
	/*
	 * Removes account with number
	 */
	boolean removeAccount (int number){
		return true;
	}
	/*
	 * Returns the list of all the accounts
	 */
	ArrayList<BankAccount> getAllAccounts(){
		return accounts;
	}
	/*
	 * returns all the accounts owned by owner with that idNbr
	 */
	ArrayList<BankAccount> findAccountsForHolder(long idNbr){
		return null;
	}
	/*
	 * returns a list of all the customers with namePart in their name
	 */
	ArrayList<Customer> findByPartOfName(String namePart) {
		return null;
	}
	
}
