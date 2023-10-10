package Assignments;

public class AxisBank extends BankInfo {

	public void deposit() {
		super.deposit();
		System.out.println("Axisbank deposit");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();

	}

}
