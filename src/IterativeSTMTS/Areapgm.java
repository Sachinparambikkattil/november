package IterativeSTMTS;

public class Areapgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areapgm ob=new Areapgm();
		double s=ob.circle();
				System.out.println("circle area "+s);
		double ar=ob.rectangle();
		System.out.println("rectangle area =" +ar);
		double ta=ob.triangle();
		System.out.println("triangle area ="+ta);
		double sa=ob.square();
		System.out.println("area of square ="+sa);
				

	}
	public double circle()
	{
		double r=5,a;
		 a=3.14*r*r;
		//System.out.println(a);
		return (a);
	}
	public double rectangle() 
	{
		double l=5,b=3,ar;
		ar=l*b;
		return(ar);
	}
	public double triangle() 
	{
		double b=20,h=25,ta;
		ta=0.5*(b*h);
		return(ta);
	}
	public double square() 
	{
		double a=4,sa;
		sa=a*a;
		return(sa);
	}
	

}
