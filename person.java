package inheritance;

public class person {
protected String name;
protected int age;
protected char gender;

public person(String name, int age, char gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public void display() {
	System.out.println("display of the person class");
}
public void fun1() {
	System.out.println("fun1 of the poerson class");
}
@Override
public String toString() {
	return "person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

}
