package encapsulationdemo.account;

public class Main {
	public static void main(String[] args) {
		//creating object with initial balance
		Account myAccount = new Account(1000);
		
		//access balance using getter method
		System.out.println("Initial Balance: " + myAccount.getBalance());
		
		//deposit money
		myAccount.deposit(15000);
		System.out.println("Updated Balance:" + myAccount.getBalance());
		
		//attempt to withdraw
		myAccount.withdraw(20000);
		
		//withdraw valid amount
		myAccount.withdraw(5000);
		System.out.println("Balance after withdrawal: " + myAccount.getBalance());
	}

}
