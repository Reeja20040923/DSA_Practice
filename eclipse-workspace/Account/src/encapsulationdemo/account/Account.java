package encapsulationdemo.account;

class Account {
	private double balance;
	// constructor to create initial balance
	Account(double initialBalance){
		if(initialBalance >= 0) {
			this.balance = initialBalance;
		}
		else {
			System.out.println("Invalid ! Balance cannot be negative");
		}
	}
	//public getter method to return balance 
	public double getBalance() {
		return balance;
	}
	//public setter method to deposit amount into account
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			System.out.println("Deposited : " +amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	//public setter method to withdraw amount
	public void withdraw(double amount) {
		if(amount > 0 && amount<balance) {
			balance -= amount;
			System.out.println("Withdrawn : " +amount);
		}
		else if(amount>balance) {
			System.out.println("Insufficient amount entered !!");
		}
		else {
			System.out.println("Invalid! amount cannot be negavtive ");
		}
	}
	
}


