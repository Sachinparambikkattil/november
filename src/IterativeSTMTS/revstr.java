package IterativeSTMTS;

public class revstr {

	public static void main(String[] args) {
		
		String s="rio";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse= "+rev);
		

	}

}
