package make_change;

import java.util.*;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter price: ");
		Scanner input1 = new Scanner(System.in);
		double price = input1.nextDouble();
		System.out.println();
		
		System.out.print("Enter money received: ");
		Scanner input2 = new Scanner(System.in);
		double received = input2.nextDouble();
		System.out.println();
		
		double change;
		
		if(price > received) {
			System.out.println("Not enough money");
			change = 0;
		}
		if(price == received) {
			change = 0;
		}
		else {
			change = received - price;
		}
		
		System.out.println("Change returned: ");
		
		int dollars = (int)(change / 1);
		change = change - dollars;
		
		int quarters = (int)(change / 0.25);
		change = change - quarters * 0.25;
		
		int dimes = (int)(change / 0.1);
		change = change - dimes * 0.1;
		
		int nickels = (int)(change / 0.05);
		change = change - nickels * 0.05;
		
		int pennies = (int)(change / 0.01);
		change = change - pennies * 0.01;
		
		System.out.println("Dollars: " + dollars);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}

}
