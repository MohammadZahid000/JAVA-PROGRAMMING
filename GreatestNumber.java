package module3;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the number");
		int num2=sc.nextInt();
		System.out.println("Enter the number");
		int num3=sc.nextInt();
		if(num1>=num2 && num1>=num3) {
		System.out.println("Number one is greatest"+num1);
		}
		else if(num2>=num1 && num2>=num3) {
		System.out.println(num2+"number two is greatest");
		}
		
		else{
			System.out.println(num3 +"number three is greatest");
		}
		}

	}


