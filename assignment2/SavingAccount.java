package labAssignment2;

public class SavingAccount extends Account {
	private double interest = 5;
	private double maxWithdrawLimit = 50000.0;
	private double minBalance = 2000.0;
	
	
	public SavingAccount() {}
	
	public SavingAccount(String memberName,double accountBalance) {
		super(memberName,accountBalance);
	}

	public double getBalance() {
		return this.getAccountBalance() + this.getAccountBalance()*(interest)*(0.01);
	}
	
	public void withdraw(double amount) {
		double tempBalance = this.getAccountBalance() - amount;
		if(amount > maxWithdrawLimit || tempBalance < minBalance) {
			System.out.println("You cannot withdraw beyond limit!");
		}else {
			this.setAccountBalance(tempBalance);
		}
	}
}



