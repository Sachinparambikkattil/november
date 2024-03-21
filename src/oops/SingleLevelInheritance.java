package oops;

class Parent
{
	public void parentmethod()
	{
		System.out.println("parent details");
	}
	
}
class Child extends Parent
{
	public void childmthd()
	{
		System.out.println("child details");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob=new Child();
		ob.childmthd();
		ob.parentmethod();
		

	}

}
