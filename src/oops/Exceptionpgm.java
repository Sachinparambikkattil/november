package oops;

public class Exceptionpgm {

	public static void main(String[] args) {
		try {
		int a=10,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("arithmetic exception");
			System.out.println(e.getLocalizedMessage());
		}
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e) {
		System.out.println(e.getLocalizedMessage());
		
		}

	}

}
