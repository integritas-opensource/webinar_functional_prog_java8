package fpjava8.demo01_01;

public class BankAccount {

	private double balance;
		
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}


	public static void main(String[] args) {
		BankAccount account = new BankAccount(100);
		account.deposit(50);
		account.withdraw(30);
		System.out.println(account.getBalance());

	}

}
