package labAssignment2;

public class CurrentAccount extends Account{
	private int tradeLiscenceNumber;

	public CurrentAccount() {}

	public CurrentAccount(String memberName,double accountBalance,int tradeLiscenceNumber) {
		super(memberName,accountBalance);
		this.tradeLiscenceNumber = tradeLiscenceNumber;
	}
	
	public double getBalance() {
		return this.getAccountBalance();
	}
	
	public int getTradeLiscenceNumber() {
		return tradeLiscenceNumber;
	}

	public void withdraw(double amount) {
		if(amount > this.getAccountBalance()) {
			System.out.println("You cannot withdraw beyond limits!");
		}else {
			this.setAccountBalance(this.getAccountBalance() - amount);
		}
	}

}


