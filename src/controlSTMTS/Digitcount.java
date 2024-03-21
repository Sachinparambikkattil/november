package controlSTMTS;

public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=34567;
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("count"+c);

	}

}
