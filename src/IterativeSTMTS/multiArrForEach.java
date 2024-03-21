package IterativeSTMTS;

import java.util.Scanner;

public class multiArrForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] sa=new int[2][2];
		System.out.println("enter numbers");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
			  sa[i][j]=sc.nextInt();
			}
		}
		for (int v1[]:sa)
		{
			for (int v2:v1)
			{
				System.out.print(v2+"");
			
		}
			System.out.println();
		

	}


	}
	}
