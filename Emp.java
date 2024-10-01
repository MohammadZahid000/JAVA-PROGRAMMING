package inheritance;

public class Emp extends Student {
	protected int empno;
	protected String company;
	protected int sal;
	public Emp(String name, int age, char gender, int rollNo, String stream, double score, int empno, String company,
			int sal) {
		super(name, age, gender, rollNo, stream, score);
		this.empno = empno;
		this.company = company;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", company=" + company + ", sal=" + sal + ", rollNo=" + rollNo + ", stream="
				+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
