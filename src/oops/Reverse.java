package oops;

public class Reverse {

	public static void main(String[] args) {
		String s ="Testing Training Centre";
		System.out.println("string = "+s);
		String [] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--) 
		{
			System.out.print(s1[i]+" ");
		}
		
		

	}

}
