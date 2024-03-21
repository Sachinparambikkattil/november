package oops;
class Employ{
	private String empname;
	private int age;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Encappgm {

	public static void main(String[] args) {
	Employ ob=new Employ();
	ob.setAge(22);
	ob.setEmpname("bro");
	System.out.println("name is "+ob.getEmpname());
	System.out.println("age is "+ob.getAge());

	}

}
