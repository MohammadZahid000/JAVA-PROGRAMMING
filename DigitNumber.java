package module3;
import java.util.Scanner;
public class DigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
        if (number >= 0 &&number<10) { 
        	System.out.println("The number is a 1-digit number.");
		 }
        else if (number >= 10 && number <100) 
		{
        	 System.out.println("The number is a 2-digit number.");
		}
		  else if (number >= 100&& number <1000) {
			  System.out.println("The number is a 3-digit number.");
			 }
		  else {
		 System.out.println("The number has more than 3 digits.");
		 }
		 }
		}



