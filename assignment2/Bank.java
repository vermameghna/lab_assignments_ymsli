package labAssignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SavingAccount savingAccount = new SavingAccount();
		CurrentAccount currentAccount = new CurrentAccount();
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose which type of account you want to open ?");
		System.out.println("1.Saving account");
		System.out.println("2.Current account");
		
		int choice = Integer.parseInt(s.readLine());
		int whichaccount = choice;
		
		String userName;
		double accountBalance;
		System.out.println("Please enter your name: ");
		userName = s.readLine();
		System.out.println("Enter amount you want to deposit to start: ");
		accountBalance = Integer.parseInt(s.readLine());
		
		
		if(choice == 1) {
			 savingAccount = new SavingAccount(userName,accountBalance);
		}else if(choice == 2) {
			System.out.println("Enter your trade liscence number: ");
			int lisence = Integer.parseInt(s.readLine());
			currentAccount = new CurrentAccount(userName,accountBalance,lisence);
		}else {
			System.out.println("Thank you for the services!");
		}
		
		
		while(true) {
			System.out.println("Choose what action to take: ");
			System.out.println("1.Deposit money");
			System.out.println("2.Withdraw money");
			System.out.println("3.Display money");
			System.out.println("4.Exit the system");
			choice = Integer.parseInt(s.readLine());
			
			
			if(choice == 1) {
				System.out.println("Enter the amount you want to deposit: ");
				double amount = Double.parseDouble(s.readLine());
				System.out.println("Do you want to display the balance ? ");
				System.out.println("1.Yes");
				System.out.println("2.No");
				int num = Integer.parseInt(s.readLine());
				if(num == 1) {
					if(whichaccount == 1) {
						System.out.println("Amount before: " + savingAccount.getAccountBalance());
						savingAccount.deposit(amount);
						System.out.println("New amount: " + savingAccount.getAccountBalance());
					}else {
						System.out.println("Amount before: " + savingAccount.getAccountBalance());
						currentAccount.deposit(amount);
						System.out.println("New amount: " + savingAccount.getAccountBalance());	
					}
					
				}else {
					if(whichaccount == 1) {
						savingAccount.deposit(amount);
					}else {
						currentAccount.deposit(amount);
					}
				}
				
			}else if(choice == 2) {
				System.out.println("Enter the amount you want to withdraw: ");
				double amount = Double.parseDouble(s.readLine());
				System.out.println("Do you want to display the balance ? ");
				System.out.println("1.Yes");
				System.out.println("2.No");
				int num = Integer.parseInt(s.readLine());
				if(num == 1) {
					if(whichaccount == 1) {
						System.out.println("Amount before: " + savingAccount.getAccountBalance());
						savingAccount.withdraw(amount);
						System.out.println("New amount: " + savingAccount.getAccountBalance());
					}else {
						System.out.println("Amount before: " + currentAccount.getAccountBalance());
						currentAccount.withdraw(amount);
						System.out.println("New amount: " + currentAccount.getAccountBalance());
					}
				}else {
					if(whichaccount == 1) {
						savingAccount.setAccountBalance(accountBalance);
					}else {
						currentAccount.setAccountBalance(accountBalance);
					}
				}
			}else if(choice == 3) {
				
				if(whichaccount == 1) {
					System.out.println("Your account balance with interest is: "+ savingAccount.getBalance());
				}else {
					System.out.println("Your account balance with interest is: " + currentAccount.getBalance());
				}
			}else if(choice  == 4) {
				System.out.println("Thanks for Banking!");
				break;
			}else {
				System.out.println("Bad Choice!");
			}
		}
	}
}
