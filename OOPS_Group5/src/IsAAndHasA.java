import java.util.Date;

class Account {
	int accountNo;
	double balance;
	String accountHolderName;
	Date opening;
	boolean status;
	void openAcc() {
		Date date = new Date();
		System.out.println("Open account on : " + date);
	}
	void deposit() {
		System.out.println("Account Deposit...");
	}
	void withDraw() {
		System.out.println("Withdraw Money");
	}
}

class SavingAccount extends Account {
	double minBalance;
	void calculateROI() {
		System.out.println("Saving Account ROI is 5%");
	}
//	bad practice
//	void saWithDraw() {
//		System.out.println("Withdraw limit is 50K");
//	}
//	method signature - everything is same as parent class withdraw()
//	@override - annotation, just to make sure that it is overriding
	@Override
	void withDraw() {
		System.out.println("Withdraw limit is 50K");
	}
	
//	void withDraw(int x) {
//		System.out.println("Withdraw limit is 50K");
//	}
}

class CurrentAccount extends Account {
//	odlimit - over draft limit
	double odlimit;
	void computeOD() {
		System.out.println("Over draft limit is 1 Lakh");
	}
	@Override
	void deposit() {
		System.out.println("Deposit Amount in CA");
	}
}


public class IsAAndHasA {
	
//	polymorphic
	void caller(Account account) {
		account.withDraw();
		account.deposit();
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account; // downcasting
			sa.calculateROI();
		}
		else if(account instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) account;
			ca.computeOD();
		}
		System.out.println("==========================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsAAndHasA obj = new IsAAndHasA();
//		any child can be converted into parent
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
		
//		saving account object is larger, because it has its own features,
//		as well as features coming from parent class
//		SavingAccount sa = new SavingAccount();

//		now only those features are available that are common in both
//		object will be created of SavingAccount, but the type of object is Account
//		Account account = new SavingAccount();
//		sa.saWithDraw();
//		account.withDraw(); // parent's withdraw
//		sa.withDraw(10000); // child's withdraw
//		account.deposit();
//		sa.calculateROI();
		
//		System.out.println("=======================");
		
//		CurrentAccount ca = new CurrentAccount();
//		account = new CurrentAccount();
//		account.withDraw();
//		account.deposit();
//		sa.computeOD();
	}

}
