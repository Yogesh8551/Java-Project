package Atm_Interface;

import java.util.Scanner;

interface ATM{
	void withdrawing(double amount);
	void depositing(double amount);
	void checking_balance();
	void displayOption();
	
}
class User_Acc implements ATM{
	public double Acc_Balance=1000;
	
	@Override
	public void depositing(double amount) {
		if(amount<=0) {
			System.out.println("you can't deposite ");
			System.out.println("your Transaction is declined!");
		}
		else {
			Acc_Balance+=amount;
			System.out.println("your account balance after depositing that amount is : "+Acc_Balance);
			System.out.println("Transaction completed.");
			System.out.println("Thank you!");
		}
		
	}
	
	@Override
	public void withdrawing(double amount) {
		if(amount>=Acc_Balance) {
			System.out.println("your Balance is not sufficient to withdraw ! ");
			System.out.println("your Transaction is declined!");
		}
		else {
			Acc_Balance-=amount;
			System.out.println("your account balance after withdraw is : "+Acc_Balance);
			System.out.println("Transaction completed.");
			System.out.println("Thank you!");
			
		}
		
		
	}
	@Override
	public void checking_balance() {
		System.out.println("Your Account Balance is : "+Acc_Balance);
		System.out.println("Transaction completed.");
		System.out.println("Thank you!");
		
	}
	@Override
	public void displayOption() {
		
		System.out.println("choose option_____________");
		System.out.println("1----depositing amount.");
		System.out.println("2----withdrawing amount.");
		System.out.println("3----chacking Balance.");
		System.out.println("4----Quit.");
		
		
	}
	
}

public class AtmInterface {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ATM atm=new User_Acc();
		
		
		
		System.out.println("Enter the button  ");
		
		
		
		
		while(true) {
			atm.displayOption();
			System.out.println("enter the number (1-4)");
			int a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.print("Enter the amount : ");
			double amount=sc.nextDouble();
			atm.depositing(amount);
			break;
		case 2:
			System.out.print("Enter the amount : ");
			double Amount=sc.nextDouble();
			atm.withdrawing(Amount);
			break;
		case 3:
			atm.checking_balance();
			break;
		case 4:
            System.out.println("Thank you for using the ATM. Goodbye!");
            sc.close();
            System.exit(0);
            break;
		default:
			System.out.println("you enter invalid button :");	
		}
	
		
		}
	}
}
