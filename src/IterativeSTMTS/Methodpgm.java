package IterativeSTMTS;

public class Methodpgm {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Methodpgm ob=new Methodpgm();
		ob.add();
		int su=ob.sub();
		System.out.println("substactin ="+su);
		System.out.println(ob.mul(3,5));

	}
	//1.method without returntype and without parameter
	public void add()
	{
	int a=10,b=20,c;
	c=a+b;
	System.out.println(c);
	}
	//2.method with returntype without parameter
	public int sub()
	
	{
		int a=20,b=30,c;
		c=b-a;
		return c;
		
	}
	//3.method with return type and witout parameters
	public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	
	}
	//4.method without return type and with parameter
	//public void div(int a,int b)
	{
	//void c;	
	//c=a/b;
	
	}
	
	
	

}
