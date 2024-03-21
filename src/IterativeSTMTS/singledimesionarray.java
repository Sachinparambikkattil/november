package IterativeSTMTS;

import java.util.Scanner;

public class singledimesionarray {

    public static void main(String[] args) {
        int[] ar = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        for (int i = 0; i <= 2; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: ");
        for (int i = 0; i <= 2; i++) {
            System.out.println(ar[i]);
        }

		
		

	}

}
