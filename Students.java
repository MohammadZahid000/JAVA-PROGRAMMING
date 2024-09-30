package module1;

public class Students {
    private int id;
    private String name;
    private double marks;

    public void study() {
        System.out.println("Students are studying");
    }

    public void appearExam() {
        System.out.println("Students appearing in the exam");
    }

    public void attendance() {
        System.out.println("Students taking attendance for the class");
    }

    public void display() {
        System.out.println("Roll number is " + id);
        System.out.println("Name is " + name);
        System.out.println("Score is " + marks);
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
    	System.out.println("Creating an object 1");
        Students student = new Students();

        
        student.setId(11);
        student.setName("Zahid");
        student.setMarks(88.33);
        
       
        student.study();
        student.appearExam();
        student.attendance();
        student.display();
        
        System.out.println("=======================");
        System.out.println("Creating an object 2");
        Students student1 = new Students();

        
        student1.setId(12);
        student1.setName("Yash");
        student1.setMarks(85.33);
        
       
        student1.study();
        student1.appearExam();
        student1.attendance();
        student1.display();
    }
}
