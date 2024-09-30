package module3;
import java.util.Scanner;
public class User {
private String name;
private int age;
private double salary;
Scanner sc=new Scanner(System.in);
public void accept()
{
	System.out.println("Enter the name age Salary");
	name=sc.next();
	age=sc.nextInt();
	salary=sc.nextInt();
}
public void checkage()
{
	if(age>18)
	System.out.println("You are elligable to vote");
	else if(age>18&&age<100)
		System.out.println("Age is valid");
	else {
		System.out.println("Invalid age");
	}
	}
	public void checksal()
	{
		if(salary>0&&salary<100000)
		System.out.println("Your is salary is valid");
		else
			System.out.println("inalid salary");
		
}
	 public void display() {
        System.out.println("User name is " +name);
        System.out.println("User age is" +age);
        System.out.println("User Salary  is " +salary);
    }

 
}
