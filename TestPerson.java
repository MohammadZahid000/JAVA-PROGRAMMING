package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		person[] arr=new person[5];
		arr[0]=new person("Zahid",24,'M');
		arr[1]=new person("Yash",22,'M');
		arr[2]=new person("Amar",23,'M');
		arr[3]=new person("Swapnil",24,'M');
		arr[4]=new person("shilpa",25,'F');
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getName() +"is"+arr[i].getAge()+"yrs old and gender is "+arr[i].getGender());
		}
     person Person=new person("Zahid", 24, 'M');
     System.out.println(Person);
     Person.display();
     Person.fun1();
     System.out.println("=============");
     Student student=new Student("Zahid",24,'M',22,"ENTC",88.88);
     System.out.println(student);
     student.display();
     System.out.println("=================");
     Emp emp=new Emp("Zahid",24,'M',22,"ENTC",88.88,12345,"Zain",500000);
     System.out.println(emp);
     emp.display();
     System.out.println("=================");
     person Person2=new person("uma",24,'F');
     System.out.println(Person2);
     Person2=new Student("uma",24,'F',22,"ENTC",77);
     System.out.println(Person2);
     Person2=new Emp("uma",24,'F',22,"ENTC",77,12334,"zain",60000);
     System.out.println(Person2);
	}

}
