
import java.util.Scanner;

public class conversion {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double tempC, tempF;
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("How hot is it in C?");
		tempC = in.nextDouble();
		System.out.printf("it is %s degrees celsius\n", tempC);
		System.out.println("Now converting to F");
		
		tempF = tempC * 9/5 + 32;
		
		System.out.printf("It is %s degrees Fahrenheit\n", tempF);
	}

}
