package module3;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    switch(num) {
    case 5:
    	System.out.println("Movie time");
    	break;
    case 6:
    	System.out.println("Fun Sat");
    	break;
    case 7:
    	System.out.println("Sleepy Sun");
    	break;
    default:
    	System.out.println("It's working time");
    	break;
    }
	}

}
