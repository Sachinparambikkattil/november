package IterativeSTMTS;

public class Numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        int l = 1;

        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(l);
                l++;
            }
            System.out.println();
        }
    }

	}


