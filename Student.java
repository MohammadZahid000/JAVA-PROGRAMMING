package inheritance;

public class Student extends person{
	protected int rollNo;
	protected String stream;
	protected double score;
	
	public Student(String name, int age, char gender, int rollNo, String stream, double score) {
		super(name, age, gender);//calling constructor of the person class
		this.rollNo = rollNo;
		this.stream = stream;
		this.score = score;
	}
	public void display()//fun overriding
	{
		super.display();//calling the method of person
		super.fun1();
		System.out.println();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stream=" + stream + ", score=" + score + ", name=" + name + ", age="
				+ age + ", gender=" + gender + "]";
	}
	

}
