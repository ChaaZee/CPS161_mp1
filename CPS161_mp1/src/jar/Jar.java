package jar;

import java.util.*;

public class Jar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter in the number of Quarters in the Jar: ");
		Scanner input1 = new Scanner(System.in);
		int quarter = input1.nextInt();
		System.out.println();
		
		System.out.print("Enter in the number of Dimes in the Jar: ");
		Scanner input2 = new Scanner(System.in);
		int dime = input2.nextInt();
		System.out.println();
		
		System.out.print("Enter in the number of Nickels in the Jar: ");
		Scanner input3 = new Scanner(System.in);
		int nickel = input3.nextInt();
		System.out.println();
		
		System.out.print("Enter in the number of Pennies in the Jar: ");
		Scanner input4 = new Scanner(System.in);
		int penny = input4.nextInt();
		System.out.println();
		
		double quarter_value = quarter * 0.25;
		double dime_value = dime * 0.10;
		double nickel_value = nickel * 0.05;
		double penny_value = penny * 0.01;
		
		double total = quarter_value + dime_value + nickel_value + penny_value;
		System.out.println("Total: " + total);
		
	}

}
