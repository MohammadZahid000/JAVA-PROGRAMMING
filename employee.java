package module3;
import java.util.Scanner;
public class employee {
	

		private int empno;
	    private String ename;
	    private double empSalary;
	     Scanner sc=new Scanner(System.in);
	     
	     public void accept()
	     {
	    	 System.out.println("Enter the Employee id");
	    	 empno=sc.nextInt();
	    	 System.out.println("Enter the Employee name");
	    	 ename=sc.next();
	    	 System.out.println("Enter the Employee Salary");
	    	 empSalary=sc.nextInt();
	     }
	     
	     public void display() {
		        System.out.println("Employee iD number is " + empno);
		        System.out.println("Name of the Employee " + ename);
		        System.out.println("Employee Salary is " + empSalary);
		    }


	    public void completeProject() {
	        System.out.println("Employee Project is Completed!!");
	    }

	    public void checkAttendance() {
	        System.out.println("Employee Attendace is fair!!");
	    }

	    public void applyLoan() {
	        System.out.println("Loan is Accepted");
	    }

	    
	}


