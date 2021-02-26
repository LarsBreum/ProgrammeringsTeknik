

/* creates a bankaccount to a user*/
/* Needs: 
 * holderName
 * holderId
 * amount
 * accountNbr
 * count
 */

public class BankAccount {
	Customer holder;
	String holderName;
	long holderId;
	double amount;
	static int count;
	int accountNbr;
	
	BankAccount(String holderName, long holderId) { //constructor one
		this.holderName = holderName;
		this.holderId = holderId;
		count++;
		accountNbr = count;
		amount = 0;
	}
	
	BankAccount(Customer holder) { //constructor two
		this.holder = holder;
		this.holderName = holder.getName();
		this.holderId = holder.getIdNbr();
		count++;
		accountNbr = count;
		amount = 0;
	}
	
	/* returns the owner of the account */
	Customer getHolder(){
		return holder;
	}
	/* returns the amount of money in the account */
	double getAmount() {
		return amount;
	}
	/* deposits 'deposit' in the account */
	void deposit(double deposit) {
		amount = amount + deposit;
	}
	/*withdraws 'withdraw' from the account */
	void withdraw(double withdraw) {
		if(amount < withdraw) {
			System.out.println("Not enough money in account");
		} else {
			amount = amount - withdraw;
		}
	}
	/*	Returns the account Number */
	int getAccountNbr() {
		return accountNbr;
	}
	/* toString */
	public String toString(){
		String output = "Holder: " + holderName + ". Account Number: " + accountNbr + ". Amount: " + amount;
		return output;
	}
	

}
