
public class Customer {

	/**skapar en kund **/
	
	/** behöver:
	 * namn
	 * id-nummer
	 * kund-nummer (unikt och internt till banken)
	 */

	String name;
	public static int customerNbr; //static so all instances of this variable is unique
	long idNbr;
	
	Customer(String name, long idNbr) { //constructor
		this.name = name;
		this.idNbr = idNbr;
		customerNbr++; //everytime a new customer is created, it gets a number +1 higher than the one before.
		
	}
	
	/* Gets the customers name */
	String getName() {
		return this.name;
	}
	
	/* Gets the customers id */
	long getIdNbr() {
		return this.idNbr;
	}
	
	/* gets the customers internal number */
	int getCustomerNbr() {
		return Customer.customerNbr;
	}
	
	/*returns the customer as a string*/
	public String toString(){
		String output = "Name: " + name + " id: " + idNbr + " Customer Number: " + customerNbr;
		return output;
	}
}
