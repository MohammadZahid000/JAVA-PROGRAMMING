package module3;
import java.util.Scanner;
public class raiseTo {

	public static void main(String[] args)  {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the base number:");
		        int base = sc.nextInt();
		        System.out.println("Enter the exponent:");
		        int exponent = sc.nextInt();
		        
		        int result = 1;

		        
		        for (int i = 0; i < exponent; i++) {
		            result *= base; 
		        }

		        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
		       
		    }
		

	}


