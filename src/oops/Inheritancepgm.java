package oops;

class Member{
	String name;
	int age;
	int salary;
	long phoneno;
	String address;
	int Salary;
public void printdetails(){	

	System.out.println("Name="+name);
	System.out.println("age ="+age);
	System.out.println("phoneno ="+phoneno);
	System.out.println("address="+address);
	System.out.println("Salary="+Salary);
}
}
class Employee extends Member{
	 String specialisation;
		
}
class manager extends Member{
	String department;
}

public class Inheritancepgm {
	
	

	public static void main(String[] args) {
		Employee ob=new Employee();
		ob.name="Sachin";
		ob.age=22;
		ob.phoneno = 9074341466l;
		ob.address="chalakudy";
		ob.salary=120000;
		System.out.println(ob.specialisation="Tester");
		
				
		
		

	}

}
