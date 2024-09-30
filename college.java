package module2;
import java.util.Scanner;
public class college {

	
		

			private int id;
		    private String ename;
		    private String name;
		     Scanner sc=new Scanner(System.in);
		     
		     public void accept()
		     {
		    	 System.out.println("Enter the Student id");
		    	 id=sc.nextInt();
		    	 System.out.println("Enter the first name");
		    	 ename=sc.next();
		    	 System.out.println("Enter the Second Salary");
		    	 name=sc.next();
		     }
		     
		     public void display() {
			        System.out.println("Student ID is " + id);
			        System.out.println("Students First name " + ename);
			        System.out.println("Student last name " + name);
			    }


		    public void structure() {
		        System.out.println("Infrastructure of the colleage is good!!");
		    }

		    public void parking() {
		        System.out.println("Parking is avilable for the students!!");
		    }

		    public void canteen() {
		        System.out.println("Canteen is available for anyone");
		    }

		    
		}



