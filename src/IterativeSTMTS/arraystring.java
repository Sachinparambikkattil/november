package IterativeSTMTS;

import java.util.Scanner;

public class arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=new String [3];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter string: ");
        for (int i = 0; i <= 2; i++) {
            arr[i] = sc.next();
        }

        System.out.println("Entered string: ");
        //for (int i = 0; i <= 2; i++) {
           // System.out.println(arr[i]);
        for(String v:arr)
        {
        	System.out.println(v);
        }
       
		
		

	}

}
