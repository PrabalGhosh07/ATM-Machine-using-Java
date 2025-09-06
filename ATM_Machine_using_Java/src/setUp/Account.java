package setUp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double savingBalance=0;
	private double checkingBalance=0;
	
	// Set the Customer number ------>
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber= customerNumber;
		return customerNumber;
	}
	
	// Get the customer number------>
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//Set the pin number ---------->
	public int setPinNumber(int pinNumber) {
		this.pinNumber= pinNumber;
		return pinNumber;
	}
	
	//Get the pin number ------>
	public int getPinNumber() {
		return pinNumber;
	}
	
	// Get Checking Account Balance -------->
	 public double getCheckingBalance() {
		 return checkingBalance;
	 }
	
	// Get Saving Account Balance -------->
	 public double getSavingBalance() {
		 return savingBalance;
	 }
	 
	 // Calculate checking Account Withdrawal ----->
	 public double calCheckingWithdraw(double amount) {
		 checkingBalance = (checkingBalance - amount);
		 return checkingBalance;
	 }
	 
	// Calculate checking Saving Account Withdrawal ----->
	 public double calSavingWithdraw(double amount) {
		 savingBalance = (savingBalance - amount);
		 return savingBalance;
	 }
	 
	// Calculate Checking Account deposit ----->
	 public double calCheckingDeposit(double amount) {
		 checkingBalance = (checkingBalance + amount);
		 return checkingBalance;
	 }
	 
	// Calculate Saving Account deposit ----->
	 public double calSavingDeposit(double amount) {
		 savingBalance = (savingBalance + amount);
		 return savingBalance;
	 }
	 
	 //Customer Checking Account Withdraw input --->
	 public void getCheckingWithdrawInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount you want to withdraw from Checking Account: ");
		 double amount = input.nextDouble();
		 
		 if((checkingBalance - amount) >= 0) {
			 calCheckingWithdraw(amount);
			 System.out.println("New Checking Account Balace: " + moneyFormat.format(checkingBalance) + "\n");
		 }else {
			 System.out.println("Balance cannot be negative."+"\n"); 
		 }
	 }
	 
	 //Customer checking Account Deposit input ---->
	 public void getCheckingDepositInput() {
		 System.out.println("Checking Account Balance: "+moneyFormat.format(checkingBalance));
		 System.out.println("Amount you want to Deposit from Checking Account: ");
		 double amount = input.nextDouble();
		 
		 if((checkingBalance + amount) >= 0) {
			 calCheckingDeposit(amount);
			 System.out.println("New Checking Account Balace: " + moneyFormat.format(checkingBalance) + "\n");
		 }else {
			 System.out.println("Balance cannot be negative."+"\n"); 
		 }
	 }
	 
	//Customer Saving Account Withdraw input ---->
	 public void getSavingWithdrawInput() {
		 System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		 System.out.println("Amount you want to Withdraw from Saving Account: ");
		 double amount = input.nextDouble();
		 
		 if((savingBalance - amount) >= 0) {
			 calSavingWithdraw(amount);
			 System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
		 }else {
			 System.out.println("Balance cannot be negative."+"\n"); 
		 }
	 }
	 
	//Customer Saving Account Deposit input ---->
	 public void getSavingDepositInput() {
		 System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
		 System.out.println("Amount you want to Deposit from Saving Account: ");
		 double amount = input.nextDouble();
		 
		 if((savingBalance + amount) >= 0) {
			 calSavingDeposit(amount);
			 System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
		 }else {
			 System.out.println("Balance cannot be negative."+"\n"); 
		 }
	 }

}
