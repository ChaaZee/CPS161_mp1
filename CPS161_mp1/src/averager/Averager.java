package averager;

import java.util.*;

public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number: ");
		Scanner input1 = new Scanner(System.in);
		int number1 = input1.nextInt();
		System.out.println();
		
		System.out.print("Enter number: ");
		Scanner input2 = new Scanner(System.in);
		int number2 = input2.nextInt();
		System.out.println();
		
		System.out.print("Enter number: ");
		Scanner input3 = new Scanner(System.in);
		int number3 = input3.nextInt();
		System.out.println();
		
		int[] i = {number1, number2, number3};
		double average = (double)((i[0] + i[1] + i[2]) / i.length); 
		System.out.println("Average: " + average);
	}

}
