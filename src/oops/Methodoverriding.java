package oops;
class Dad
{
	public void work() {
		System.out.println("pilot");
	}
	}

class Son extends Dad{
	@Override
	public void work() {
		System.out.println("developer");
		super.work();
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		Son ob=new Son();
		ob.work();
			
     }

}
