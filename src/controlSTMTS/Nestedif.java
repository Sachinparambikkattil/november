package controlSTMTS;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=19,weight=65;
		if(age>=18)
		{
			if(weight>=50)
			{
				System.out.println("eligible to donate blood");
			}
			else 
			{
				System.out.println("not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("not eligible to donate blood,must be more than 18");
			
		}

	}

}
