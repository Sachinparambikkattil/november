package oops;
abstract class car
{
	abstract public void enginedetails();
	public void cardetails()
	{
		System.out.println("car details");
	}
	}
class suzuki extends car
{

	@Override
	public void enginedetails() {
		System.out.println("1 litre");
		
	}
	
}
class audi extends car{

	@Override
	public void enginedetails() {
		System.out.println("2 litre");
		
	}
	
}


public class Abstractclasss {

	public static void main(String[] args) {
		audi ob=new audi();
		ob.enginedetails();
		suzuki ob1=new suzuki();
		ob1.enginedetails();
		
		
		
		

	}

}
