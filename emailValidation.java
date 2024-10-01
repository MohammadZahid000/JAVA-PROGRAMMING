package validation;
import java.util.Scanner;
public class emailValidation {
	public void checkEmail(String email) {
		int a = email.indexOf("@");
		int d= email.lastIndexOf(".");
		if(a>-1 && d>-1 && a<d)
		{
			System.out.println("Valid email ID:"+ email);
		}
		
			else
			{
				System.out.println("Invalid emial ID:"+ email);
			}
		}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		emailValidation Emailvalidation=new emailValidation();
		System.out.println("Enter Your email ID:");
		String email=sc.next();
		
		
		emailValidation emailValidation2 = new emailValidation();
		emailValidation2.checkEmail(email);

	}
	

}


