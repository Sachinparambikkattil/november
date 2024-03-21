package oops;

interface bike
{
	public void acceleration();
	}
class ather implements bike
{

	@Override
	public void acceleration() {
		System.out.println("ather acceleration");
		
		
	}
	}
class ola implements bike
{

	@Override
	public void acceleration() {
		System.out.println("ola acceleration");
		
		
	}
	}

public class Interfacepgm {

	public static void main(String[] args) {
		bike ob=new ather();
		ob.acceleration();
		ob=new ola();
		ob.acceleration();

	}

}
