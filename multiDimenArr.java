package module6;
import java.util.Scanner;
public class multiDimenArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
    int[][] arr=new int[3][4];
    for(int i=0;i<3;i++) {
    	for (int j=0;j<4;j++) {
    		arr[i][j]=sc.nextInt();
    	}
    }
    System.out.println("=========");
    System.out.println("Display the arr");
    System.out.println("rollNo          C++           java             mySql");
    for(int i=0;i<3;i++) {
    	for (int j=0;j<4;j++) {
    		System.out.print(arr[i][j]+"\t\t");
    	}
    	System.out.println();
	}

}
}

