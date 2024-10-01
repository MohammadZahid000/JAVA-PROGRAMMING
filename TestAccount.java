package UserinterFace;
import entity.Account;
import java.util.Scanner;
import operation.AccountOperation;
public class TestAccount {

	public static void main(String[] args) {
		Account account1=new Account(1,"Rohit",30000);
		Account account2=new Account(2,"Zahid",40000);
		Scanner sc=new Scanner(System.in);
		AccountOperation accountoperation= new AccountOperation();
        int ch;
        String choice;
        do {

			System.out.println("ICICI Bank");

			System.out.println("1.Accept details");

			System.out.println("2.Dispaly the details");

			System.out.println("3.Withdraw Amount");

			System.out.println("4.Deposit Amount");

			System.out.println("5.Transfer Amount");

			System.out.println("6.Check Balance");

			System.out.println("7.Update Balance");

			System.out.println("8.Exit");



			System.out.println("Enter your choice");

			ch = sc.nextInt();



			switch (ch) {

			case 1:

			System.out.println("Accepting details");

			break;

			case 2:

			System.out.println("Displaying details");
			System.out.println("AccountNumber is"+account1.getAccountNumber());
			System.out.println("name is"+account1.getAccountHolderName());
			System.out.println("Balance is "+account1.getBalance());

			break;

			case 3:

			System.out.println("Withdraw amount");
			double amount=sc.nextDouble();
			boolean result=accountoperation.withdraw(account1,amount);
			if(result==true) {
				System.out.println("WITHDRAW IS SUCCESSFUL");
				System.out.println("THE NEW BALANCE IS "+account1.getBalance());
			}			

			break;

			case 4:
			System.out.println("Deposit amount");
			double depositAmount = sc.nextDouble();
			boolean depositResult = accountoperation.deposit(account1, depositAmount);

			if (depositResult==true) {
			    System.out.println("DEPOSIT IS SUCCESSFUL");
			    System.out.println("THE NEW BALANCE IS " + account1.getBalance());
			} else {
			    System.out.println("DEPOSIT FAILED");
			}

			break;

			case 5:

			System.out.println("ENTER THE AMOUNT TO TRANSFER");
			double transferamount=sc.nextDouble();
			System.out.println("AMOUNT1 OLD BALANCE IS " + account1.getBalance());
		    System.out.println("AMOUNT2 OLD BALANCE IS " + account2.getBalance());
			result=accountoperation.transfer(account1, account2, transferamount);

			if (result==true) {
			    System.out.println("TRANSFER IS SUCCESSFUL");
			    System.out.println("AMOUNT1 NEW BALANCE IS " + account1.getBalance());
			    System.out.println("AMOUNT2 NEW BALANCE IS " + account2.getBalance());
			} else {
			    System.out.println("TRANSFER FAILED");
			}

            break;
			case 6:
			System.out.println("Checking balance...");
			double currentBalance = account1.getBalance();
			double currentBalance1 = account2.getBalance();
			System.out.println("YOUR AMOUNT1 CURRENT BALANCE IS " + currentBalance);
			System.out.println("YOUR AMOUNT2 CURRENT BALANCE IS " + currentBalance1);


			break;

			case 7:

			System.out.println("Update amount");

			break;

			case 8:

			System.out.println("Thanks for visiting bank");

			System.exit(0);



			}

			System.out.println("Do you want to continue(Y/N)");

			choice = sc.next();

			} while (choice.equalsIgnoreCase("Y"));

			System.out.println("Thanks for visiting bank");



			}



			
		

	}


