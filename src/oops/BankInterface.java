package oops;

import java.util.Scanner;

interface BankApplication
{
 public void accountDetails();
 public void balance();
 public void withdraw();
 public void deposit();
}
 
class FDRL implements BankApplication
{
	static String bankname = "Federal Bank"; 
	int balance = 0,amount = 0,minbalance = 0;
	int deposit;
	int withdraw;
	int AccNo;
	String name;
	Scanner sc = new Scanner(System.in);
	
	

	@Override
	public void accountDetails() {
		
		System.out.println("Enter Account Number : ");
		AccNo = sc.nextInt();
		System.out.println(name);
		
		
	}

	@Override
	public void balance() {
		System.out.println(+balance);
		
	}

	@Override
	public void withdraw() {
		
		if(balance-amount >=minbalance)
		{
		  balance = balance - amount;
		  System.out.println(+balance);
		}
		
		
	}

	@Override
	public void deposit() {
		
		balance = balance+amount;
		System.out.println(+balance);
		
		
		
	}

	public void name() {
		// TODO Auto-generated method stub
		
	}

	public void sc() {
		// TODO Auto-generated method stub
		
	}
	
}
public class BankInterface {

	public static void main(String[] args) {
		
		

	}

}