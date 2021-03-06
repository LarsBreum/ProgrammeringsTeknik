
public class Customer {

	/**skapar en kund **/
	
	/** behöver:
	 * namn
	 * id-nummer
	 * kund-nummer (unikt och internt till banken)
	 */

	String name;
	static int count;
	int customerNbr; 
	long idNbr;
	
	Customer(String name, long idNbr) { //constructor
		this.name = name;
		this.idNbr = idNbr;
		count++;
		customerNbr = count;
		
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
		return customerNbr;
	}
	
	/*returns the customer as a string*/
	public String toString(){
		String output = "Name: " + name + " id: " + idNbr + " Customer Number: " + customerNbr;
		return output;
	}
}
