package module6;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		  Student student1=new Student();
//		 student1.display();
		System.out.println("enter rollno,name,score");
		int rollNo=sc.nextInt();
		String name=sc.next();
		double score=sc.nextDouble();
		
    Student student=new Student();
    student.setRollNo(rollNo);
    student.setName(name);
    student.setScore(score);
    //to display();
    System.out.println("displaying the details....");
    System.out.println(" roll no is "+student.getRollNo());
    System.out.println("name is "+student.getName());
    System.out.print("score is "+student.getScore());
    System.out.println("displaying the details....");
    
//    student.display();
    Student student2= new Student(2,"Zahid",88.33);
    student2.setRollNo(rollNo);
    student2.setName(name);
    student2.setScore(score);
    System.out.println("displaying the details....");
    System.out.println(" roll no is "+student2.getRollNo());
    System.out.println("name is "+student2.getName());
    System.out.print("score is "+student2.getScore());
    System.out.println("displaying the details....");
    student.markAttendance();
    System.out.println("===========");
    System.out.println(" changing the name");
    System.out.println("Enter the new name");
    String name1=sc.next();
    student2.setName(name1);
    System.out.println("new name is "+student2.getName());
    
//    System.out.println("==========");
//    Student student2=new Student(2, "zahid",90);
//     student2.display();
//     student2.markAttendance();
	}

}
