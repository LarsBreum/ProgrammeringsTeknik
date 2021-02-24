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
	 * Open a new bank account. 
	 * If the customer already exists a new customer should not be added, 
	 * but that user should be the owner of the account
	 */
	int addAccount(String holderName, long idNbr) {
		
		int output = 0;
		Boolean exists = false;
		
		for(BankAccount account : accounts) {
			if(account.getHolder().getIdNbr() == idNbr) { //checking if customer already exists
				accounts.add(new BankAccount(account.getHolder()));
				output = account.getAccountNbr();
				exists = true;
				break;
			} 
		}	
		//if customer does not exist create new account with
		if(exists == false) {
			accounts.add(new BankAccount(new Customer(holderName, idNbr)));
			output = accounts.get(accounts.size()-1).getAccountNbr();
		}
		return output;
	}
	
	/*
	 * Returns customer with idNbr
	 */
	Customer findHolder(long idNbr) {
		
		for (BankAccount account : accounts) {
			
		}
		
		return null;
	}
	/*
	 * Removes account with the account number "number"
	 */
	boolean removeAccount (int number){
		return true;
	}
	/*
	 * Returns the list of all the accounts. Sorted by name ascending
	 */
	ArrayList<BankAccount> getAllAccounts(){
		return accounts;
	}
	/*
	 * returns all the accounts owned by owner with that idNbr
	 */
	ArrayList<BankAccount> findAccountsForHolder(long idNbr){
		ArrayList<BankAccount> output = new ArrayList<BankAccount>();
		for (BankAccount account : accounts) {
			
			if(idNbr == account.getHolder().getIdNbr())
			output.add(account);			
		}
		return output;
	}
	/*
	 * returns a list of all the customers with namePart in their name
	 */
	ArrayList<Customer> findByPartOfName(String namePart) {
		
		ArrayList<Customer> output = new ArrayList<Customer>(); //output list
		for(BankAccount account : accounts) {
			//if namePart is a a part of account holders name and holder does not already exists in the output list
			if(account.getHolder().getName().contains(namePart) && output.contains(account.getHolder()) == false) { 
				output.add(account.getHolder());
			}
		}
		return output;
	}
	
}
