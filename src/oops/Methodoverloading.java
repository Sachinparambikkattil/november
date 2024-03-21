package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ob=new Methodoverloading();
				ob.sub(1.5, 1);
		ob.sub(5, 1.5);
		ob.sub(10, 5);
		

	}
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public void sub(int a,double b) 
	{
		double c=a-b;
		System.out.println("a-b ="+c);
	}
	public void sub(double a,int b)
	{
	double c=a-b;
	System.out.println(c);
	}


}
