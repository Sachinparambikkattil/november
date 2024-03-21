package IterativeSTMTS;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="world";
		String s2="lorem";
		String s3="welcome to india";
		//split
		
		String[] st=s3.split(" ");
		for( String str:st) {
			System.out.println(str);
		}
		//replace
		System.out.println(s3.replace("welcome","go"));

	}

}
