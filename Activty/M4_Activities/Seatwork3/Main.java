package Activty.M4_Activities.Seatwork3;

public class Main {
	public static void main(String[] args) {
	ATMTransaction atmTransac = new ATMTransaction();
	
	System.out.println("");
	System.out.println("=== ATM BALANCE INQUIRY SYSTEM ===\n");
	System.out.println("--- Test Case 1: Valid Savings Account ---");
	atmTransac.checkBalance("100123456",15000.00);
	System.out.println("--- Test Case 2: Valid Checking Account ---");
	atmTransac.checkBalance("200987654",25000.00);
	System.out.println("--- Test Case 3: Invalid Account Number Format ---");
	atmTransac.checkBalance("ABC12345",15000.00);
	System.out.println("--- Test Case 4: Empty Account Number ---");
	atmTransac.checkBalance("",15000.00);
}
}