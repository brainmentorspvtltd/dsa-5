abstract class Loan {
	void applyForLoan() {
		System.out.println("Apply for loan...");
	}
	abstract void emi();
//	we are forcing child classes to implement this method
}

class HomeLoan extends Loan {
	@Override
	void emi() {
		System.out.println("Home Loan EMI...");
	}
}

class EduLoan extends Loan {
	@Override
	void emi() {
		System.out.println("Edu Loan EMI...");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan home = new HomeLoan();
		EduLoan edu = new EduLoan();
	}

}
