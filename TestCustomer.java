package module6;

import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			  Customer customer=new Customer();
			  System.out.println(customer);
         
              
//			System.out.println("customerID is "+customer.getCustomerId());
//			System.out.println("customer name is "+customer.getName());
//			System.out.println("customer mobilenumber is "+customer.getMobileNumber());
//			System.out.println("customeraddress is "+customer.getAddress());
//			
			System.out.println("==============");
			System.out.println("Second object");
			 Customer customer1=new Customer(9365, "zahid", 987456321, "Malegaon");
			 System.out.println(customer1);
			 
	         
             
//				System.out.println("customerID is "+customer1.getCustomerId());
//				System.out.println("customer name is "+customer1.getName());
//				System.out.println("customer mobilenumber is "+customer1.getMobileNumber());
//				System.out.println("customeraddress is "+customer1.getAddress());
//				 String customer1=sc.next();
//				  customer1.setcustomer(customer1);
//				   System.out.println("New CustomerId is"+customer1.getName());
				
	}

}
