

/* creates a bankaccount to a user*/
/* Needs: 
 * holderName
 * holderId
 * amount
 * 
 */

public class BankAccount {
	String holderName;
	long holderId;
	double amount;

	BankAccount(Customer Holder) { //constructor
		this.holderName = Holder.getName();
		this.holderId = Holder.getIdNbr();
		amount = 0;
	}
	
	/* returns the owner of the account */
	String getHolder(){
		return holderName;
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
		amount = amount - withdraw;
	}
	/* toString */
	public String toString(){
		String output = "Holder: " + holderName + " Amount: " + amount;
		return output;
	}
	

}
