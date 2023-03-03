package gas_mileage;

import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter miles: ");
		Scanner keyboard = new Scanner(System.in);
		int miles = keyboard.nextInt();
		
		System.out.println("Enter gallons of gas: ");
		Scanner keyboard1 = new Scanner(System.in);
		double gas = keyboard1.nextDouble();
		
		System.out.println(miles/gas + " miles per gallon");
	}

}
